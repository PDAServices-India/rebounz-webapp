package com.rebounz.login.dao;

public final class UserDaoQuery {
	
	private UserDaoQuery() {
		
	}
	
	public static final String GET_USER_BY_ID = "select user_id as id, username, salt, password_hash, status, firstname, lastname" 
			+ " from USER where user_id = ?";
	
	public static final String GET_USER_BY_USERNAME = "select user_id as id, username, salt, password_hash, status, firstname, lastname" 
			+ " from USER where username = ?";

}
