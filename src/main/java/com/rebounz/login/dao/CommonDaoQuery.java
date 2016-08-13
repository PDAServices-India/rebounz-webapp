package com.rebounz.login.dao;

public final class CommonDaoQuery {

	private CommonDaoQuery() {

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

	public static final String INSERT_ACCOUNT = "INSERT INTO usr_acc_details(USERNAME, "
			+ " USER_ID) VALUES(?,?)";

	public static final String GET_USER_ID = "select user_id as id from USER where username = ";

	/*public static final String GET_ACCOUNT_USERNAME = "SELECT "
			+ "  us.username, "
			+ "  us.firstname, "
			+ "  us.lastname, "
			+ "  us.email, "
			+ "  us.country, "
			+ "  us.state, "
			+ "  us.zipcode, "
			+ "  uac.CARDHOLDERNAME, "
			+ "  uac.CARDNUMBER, "
			+ "  uac.PAYEMENTMODE, "
			+ "  uac.PAYEMENTTYPE, "
			+ "  uac.EXPIREMONTH, "
			+ "  uac.EXPIREYEAR "
			+ " FROM USER us LEFT JOIN "
			+ "  usr_acc_details uac "
			+ " ON us.username   = uac.username " 
			+ " AND us.username = ? ";*/
	
	public static final String GET_ACCOUNT_USERNAME = "SELECT us.user_id, "
	+ "  us.username, "
	+ "  us.firstname, "
	+ "  us.lastname, "
	+ "  us.email, "
	+ "  us.country, "
	+ "  us.state, "
	+ "  us.zipcode, "
	+ "  uac.CARDHOLDERNAME, "
	+ "  uac.CARDNUMBER, "
	+ "  uac.PAYEMENTMODE, "
	+ "  uac.PAYEMENTTYPE, "
	+ "  uac.EXPIREMONTH, "
	+ "  uac.EXPIREYEAR "
	+ " FROM USER us, "
	+ " usr_acc_details uac "
	+ " WHERE us.username = ? " 
	+ " AND us.username   = uac.username ";

	public static final String UPDATE_USER_DETAILS = "update user set firstname = ? , lastname = ? , email = ? , country = ? , state = ? , zipcode = ? where username = ?";

	public static final String UPDATE_ACCOUNT_DETAILS = "update usr_acc_details set CARDHOLDERNAME = ?,CARDNUMBER = ?,PAYEMENTMODE = ?,PAYEMENTTYPE = ? ,EXPIREMONTH = ? ,EXPIREYEAR= ? where username = ?";
}
