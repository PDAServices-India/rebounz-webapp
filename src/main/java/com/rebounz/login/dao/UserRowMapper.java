package com.rebounz.login.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.rebounz.login.beans.User;

public class UserRowMapper implements RowMapper < User > {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setId(rs.getString("id"));
		user.setUsername(rs.getString("username"));
		user.setPasswordHash(rs.getString("password_hash"));
		user.setSalt(rs.getString("salt"));
		user.setFirstname(rs.getString("firstname"));
		user.setLastname(rs.getString("lastname"));
		user.setStatus(rs.getString("status"));
		user.setEmail(rs.getString("email"));
		user.setCountry(rs.getString("country"));
		user.setState(rs.getString("state"));
		user.setZipCode(rs.getString("zipcode"));
		return user;
	}

}
