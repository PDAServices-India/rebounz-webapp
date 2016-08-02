package com.rebounz.login.util;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import org.apache.commons.codec.binary.Base64;

public final class HashingUtils {

	private HashingUtils() {

	}

	private static final int ITERATIONS = 65536;

	private static final int SIZE = 256;

	private static final String SHA_1 = "PBKDF2WithHmacSHA1";

	public static String generateRandomSalt() {
		SecureRandom random = new SecureRandom();
		byte[] salt = new byte[32];
		random.nextBytes(salt);
		return Base64.encodeBase64String(salt);
	}

	public static boolean comparePasswordHashes(String password, String salt, String passwordHash) {
		String generatedHash = "";
		try {
			generatedHash = generateHash(password, salt);
		} catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
			return false;
		}
		//System.out.println("Generated Hash: " + generatedHash);
		//System.out.println("Original Hash: " + passwordHash);
		return passwordHash.equals(generatedHash);
	}

	public static String generateHash(String password, String salt)
			throws NoSuchAlgorithmException, InvalidKeySpecException {
		KeySpec spec = new PBEKeySpec(password.toCharArray(), Base64.decodeBase64(salt), ITERATIONS, SIZE);
		SecretKeyFactory skf = SecretKeyFactory.getInstance(SHA_1);
		SecretKey key = skf.generateSecret(spec);
		return Base64.encodeBase64String(key.getEncoded());
	}

	/*public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException {
		String salt = generateRandomSalt();
		String password = "Password123#";
		String passwordHash = generateHash(password, salt);
		System.out.println("Test 1 : " + comparePasswordHashes(password, salt, passwordHash));
		System.out.println("Test 2 : " + comparePasswordHashes("password123#", salt, passwordHash));
	}*/
}
