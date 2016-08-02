package com.rebounz.login.dao;

import com.rebounz.common.exception.NotFoundException;
import com.rebounz.login.beans.User;

public interface UserDao {

	public User findUserById(Integer id) throws NotFoundException;

	public User findUserByUsername(String username) throws NotFoundException;

}
