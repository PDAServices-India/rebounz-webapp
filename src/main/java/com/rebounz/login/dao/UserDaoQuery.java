package com.rebounz.login.dao;

public final class UserDaoQuery {
	
	private UserDaoQuery() {
		
	}
	
	public static final String GET_USER_BY_ID = "select user_id as id, username, salt, password, password_hash, "
			+ " status, firstname, lastname, email, country, state, zipcode " 
			+ " from USER where user_id = ?";
	
	public static final String GET_USER_BY_USERNAME = "select user_id as id, username, salt, password, "
			+ " password_hash, status, firstname, lastname, email, country, state, zipcode " 
			+ " from USER where username = ?";
	
	public static final String INSERT_USER = "INSERT INTO USER(USERNAME, "
	           + " PASSWORD, FIRSTNAME, LASTNAME, EMAIL, COUNTRY, STATE, "
	           + " ZIPCODE) VALUES(?,?,?,?,?,?,?,?)";
	
}
