package com.rebounz.login.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.rebounz.login.beans.Account;

public class AccountRowMapper implements RowMapper<Account> {

	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account account = new Account();
		account.setUserid(rs.getString("USER_ID"));
		account.setUsername(rs.getString("USERNAME"));
		account.setFirstname(rs.getString("FIRSTNAME"));
		account.setLastname(rs.getString("LASTNAME"));
		account.setCountry(rs.getString("COUNTRY"));
		account.setEmail(rs.getString("EMAIL"));
		account.setState(rs.getString("STATE"));
		account.setZipCode(rs.getString("ZIPCODE"));
		account.setCardName(rs.getString("CARDHOLDERNAME"));
		account.setCardNumber(rs.getString("CARDNUMBER"));
		account.setExpireMonth(rs.getString("EXPIREMONTH"));
		account.setExpireYear(rs.getString("EXPIREYEAR"));
		account.setPayementMode(rs.getString("PAYEMENTMODE"));
		account.setPayementType(rs.getString("PAYEMENTTYPE"));
		return account;
	}
}
