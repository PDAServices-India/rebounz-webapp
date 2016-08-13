package com.rebounz.login.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.rebounz.common.exception.ApplicationException;
import com.rebounz.common.exception.NotFoundException;
import com.rebounz.login.beans.Account;
import com.rebounz.login.dao.AccountDao;
import com.rebounz.login.service.AccountService;

public class AccountServiceImpl implements AccountService {

	private static final Log LOGGER = LogFactory
			.getLog(AccountServiceImpl.class);

	@Autowired
	private AccountDao accountDao;

	/**
	 * @return the accountDao
	 */
	public AccountDao getAccountDao() {
		return accountDao;
	}

	/**
	 * @param accountDao
	 *            the accountDao to set
	 */
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public boolean updateAccDetails(Account accountDetails)
			throws ApplicationException {
		LOGGER.info("Inside User Registration service");
		return accountDao.updateAccDetails(accountDetails);
	}

	@Override
	public Account getAccountDetails(String username) throws NotFoundException {
		LOGGER.info("retrieving user details for : " + username);
		return accountDao.getAccountDetails(username);
	}

}
