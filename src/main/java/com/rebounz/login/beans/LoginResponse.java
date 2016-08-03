package com.rebounz.login.beans;

import java.io.Serializable;

public class LoginResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String result;
	
	private User user;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
