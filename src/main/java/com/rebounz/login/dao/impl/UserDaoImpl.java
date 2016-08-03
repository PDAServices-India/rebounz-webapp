package com.rebounz.login.dao.impl;

import static com.rebounz.login.dao.UserDaoQuery.GET_USER_BY_USERNAME;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.rebounz.common.exception.NotFoundException;
import com.rebounz.login.beans.User;
import com.rebounz.login.dao.UserDao;
import com.rebounz.login.dao.UserRowMapper;

public class UserDaoImpl implements UserDao {

	private static final Log LOGGER = LogFactory.getLog(UserDaoImpl.class);

	private JdbcTemplate jdbcTemplate;

	@Override
	public User findUserById(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserByUsername(String username) throws NotFoundException {
		User user = null;
		try {
			 user = jdbcTemplate.queryForObject(GET_USER_BY_USERNAME, new UserRowMapper(), username);
			
		} catch (DataAccessException e) {
			throw new NotFoundException("Username not found.");
		}
		LOGGER.info("Returning user object : " + user);
		return user;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
