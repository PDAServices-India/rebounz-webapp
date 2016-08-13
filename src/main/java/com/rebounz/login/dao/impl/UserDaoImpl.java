package com.rebounz.login.dao.impl;

import static com.rebounz.login.dao.CommonDaoQuery.GET_USER_BY_USERNAME;

import javax.ws.rs.core.Response;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.rebounz.common.exception.ApplicationException;
import com.rebounz.common.exception.NotFoundException;
import com.rebounz.login.beans.User;
import com.rebounz.login.dao.UserDao;
import com.rebounz.login.dao.CommonDaoQuery;
import com.rebounz.login.dao.UserRowMapper;
import com.rebounz.login.dao.UserStmtCreator;


public class UserDaoImpl implements UserDao {

	private static final Log LOGGER = LogFactory.getLog(UserDaoImpl.class);

	private JdbcTemplate jdbcTemplate;
	
	private UserStmtCreator userStmtCreator;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public UserStmtCreator getUserStmtCreator() {
		return userStmtCreator;
	}

	public void setUserStmtCreator(UserStmtCreator userStmtCreator) {
		this.userStmtCreator = userStmtCreator;
	}

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
	
	@Override
	public boolean userRegistration(User userDetails)
			throws ApplicationException {
		boolean updateRes = Boolean.FALSE;
		try {
			final PreparedStatementCreator psCm = getUserStmtCreator()
					.userRegistration(CommonDaoQuery.INSERT_USER, userDetails);
			getJdbcTemplate().update(psCm);
			updateRes = Boolean.TRUE;
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			throw new ApplicationException("User registration failed.",
					"FAILURE",
					Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
		}
		return updateRes;
	}

}
