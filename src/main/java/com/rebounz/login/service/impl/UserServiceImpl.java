package com.rebounz.login.service.impl;

import static com.rebounz.login.util.HashingUtils.comparePasswordHashes;

import java.util.List;

import javax.ws.rs.core.Response;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.rebounz.common.exception.ApplicationException;
import com.rebounz.common.exception.NotFoundException;
import com.rebounz.login.beans.User;
import com.rebounz.login.dao.UserDao;
import com.rebounz.login.service.UserService;

public class UserServiceImpl implements UserService {

	private static final Log LOGGER = LogFactory.getLog(UserServiceImpl.class);
	
	@Autowired
	private UserDao userDao;

	@Override
	public boolean authenticateUser(User user) throws ApplicationException {
		LOGGER.info("validating user credentials.");
		// fetch the user record from the database
		User userObj = null;
		try {
			userObj = findUserByUsername(user.getUsername());
		} catch (NotFoundException e) {
			throw new ApplicationException("Invalid username or password.", "FAILURE",
					Response.Status.BAD_REQUEST.getStatusCode());
		}
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
		LOGGER.info("retrieving user details for : " + username);
		return userDao.findUserByUsername(username);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	

}
