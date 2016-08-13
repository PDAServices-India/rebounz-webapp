package com.rebounz.login.dao.impl;

import javax.ws.rs.core.Response;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.rebounz.common.exception.ApplicationException;
import com.rebounz.common.exception.NotFoundException;
import com.rebounz.login.beans.Account;
import com.rebounz.login.dao.AccountDao;
import com.rebounz.login.dao.AccountRowMapper;
import com.rebounz.login.dao.CommonDaoQuery;

public class AccountDaoImpl implements AccountDao {

	private static final Log LOGGER = LogFactory.getLog(AccountDaoImpl.class);

	private JdbcTemplate jdbcTemplate;

	private AccountStmtCreatorImpl accountStmtCreator;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * @return the accountStmtCreator
	 */
	public AccountStmtCreatorImpl getAccountStmtCreator() {
		return accountStmtCreator;
	}

	/**
	 * @param accountStmtCreator
	 *            the accountStmtCreator to set
	 */
	public void setAccountStmtCreator(AccountStmtCreatorImpl accountStmtCreator) {
		this.accountStmtCreator = accountStmtCreator;
	}

	@Override
	public Account getAccountDetails(String username) throws NotFoundException {
		Account accDetAccount = null;
		System.out.println(">>>>"+username);
		try {
			accDetAccount = jdbcTemplate.queryForObject(
					CommonDaoQuery.GET_ACCOUNT_USERNAME,
					new AccountRowMapper(), username);
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new NotFoundException("Username not found.");
		}
		LOGGER.info("Returning user object : " + accDetAccount);
		return accDetAccount;
	}

	@Override
	public boolean updateAccDetails(Account accountDetails)
			throws ApplicationException {
		boolean updateacc = Boolean.FALSE;
		try {

			final PreparedStatementCreator ps1 = getAccountStmtCreator()
					.updateUserDetail(CommonDaoQuery.UPDATE_USER_DETAILS,
							accountDetails);
			getJdbcTemplate().update(ps1);

			final PreparedStatementCreator ps2 = getAccountStmtCreator()
					.updateAccountDetail(CommonDaoQuery.UPDATE_ACCOUNT_DETAILS,
							accountDetails);
			getJdbcTemplate().update(ps2);

		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			throw new ApplicationException("User registration failed.",
					"FAILURE",
					Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
		}
		return updateacc;
	}

}
