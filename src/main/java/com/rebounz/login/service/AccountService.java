package com.rebounz.login.service;

import com.rebounz.common.exception.ApplicationException;
import com.rebounz.common.exception.NotFoundException;
import com.rebounz.login.beans.Account;

public interface AccountService {

	public boolean updateAccDetails(Account accountDetails)
			throws ApplicationException;

	public Account getAccountDetails(String username) throws NotFoundException;

}
