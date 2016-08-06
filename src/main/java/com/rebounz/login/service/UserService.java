package com.rebounz.login.service;

import java.util.List;

import com.rebounz.common.exception.ApplicationException;
import com.rebounz.common.exception.NotFoundException;
import com.rebounz.login.beans.User;

public interface UserService {
	
	public boolean authenticateUser(User user) throws ApplicationException;
	
	public User findUserById(Integer id) throws NotFoundException;
	
	public User findUserByUsername(String username) throws NotFoundException;
	
	public List<User> findUsersById(List<Integer> ids); 
	
	public Integer saveUser(User user);
	
	public List<User> searchUser(User user);
	
	public boolean userRegistration(User userDetails) throws ApplicationException;

}
