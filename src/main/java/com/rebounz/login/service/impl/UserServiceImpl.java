package com.rebounz.login.service.impl;

import static com.rebounz.login.util.HashingUtils.comparePasswordHashes;

import java.util.List;

import javax.ws.rs.core.Response;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import com.rebounz.common.exception.ApplicationException;
import com.rebounz.common.exception.NotFoundException;
import com.rebounz.login.beans.User;
import com.rebounz.login.dao.UserDao;
import com.rebounz.login.service.UserService;

public class UserServiceImpl implements UserService {

	private static final Log LOGGER = LogFactory.getLog(UserServiceImpl.class);
	
	private UserDao userDao;

	@Override
	public boolean authenticateUser(User user) throws ApplicationException, NotFoundException {
		LOGGER.info("validating user credentials.");
		if (!StringUtils.hasText(user.getUsername()) || !StringUtils.hasText(user.getPassword())) {
			throw new ApplicationException("Invalid username or password.", "FAILURE",
					Response.Status.BAD_REQUEST.getStatusCode());
		}
		// fetch the user record from the database
		User userObj = findUserByUsername(user.getUsername());
		return comparePasswordHashes(user.getPassword(), userObj.getSalt(), userObj.getPasswordHash());
	}

	@Override
	public List<User> findUsersById(List<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer saveUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> searchUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserById(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserByUsername(String username) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	

}
