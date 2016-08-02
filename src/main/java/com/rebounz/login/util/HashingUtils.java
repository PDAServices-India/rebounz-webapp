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
	
	private static final String SHA_512 = "PBKDF2WithHmacSHA512";

	public static String generateRandomSalt() {
		SecureRandom random = new SecureRandom();
		byte[] salt = new byte[32];
		random.nextBytes(salt);
		return Base64.encodeBase64String(salt);
	}

	public static boolean comparePasswordHashes(String password, String salt, String passwordHash) {
		
		KeySpec spec = new PBEKeySpec(password.toCharArray(), Base64.decodeBase64(salt), 
				ITERATIONS, SIZE);
		try {
			SecretKeyFactory skf = SecretKeyFactory.getInstance(SHA_512);
			SecretKey key = skf.generateSecret(spec);
			byte[] hash = key.getEncoded();
		} catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
			return false;
		}
		
		return false;
	}
}
