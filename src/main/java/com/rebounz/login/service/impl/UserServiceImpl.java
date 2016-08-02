package com.rebounz.login.service.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.rebounz.common.exception.ApplicationException;
import com.rebounz.login.beans.User;
import com.rebounz.login.service.UserService;

public class UserServiceImpl implements UserService {
	
	private static final Logger LOGGER = Logger.getLogger(UserServiceImpl.class);

	@Override
	public boolean authenticateUser(User user) throws ApplicationException {
		LOGGER.info("validating user credentials.");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
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

}
