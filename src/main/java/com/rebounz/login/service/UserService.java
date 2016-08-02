package com.rebounz.login.service;

import java.util.List;

import com.rebounz.common.exception.ApplicationException;
import com.rebounz.login.beans.User;

public interface UserService {
	
	public boolean authenticateUser(User user) throws ApplicationException;
	
	public User findUserById(Integer id);
	
	public List<User> findUsersById(List<Integer> ids); 
	
	public Integer saveUser(User user);
	
	public List<User> searchUser(User user);

}
