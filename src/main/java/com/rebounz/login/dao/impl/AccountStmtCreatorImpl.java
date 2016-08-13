package com.rebounz.login.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.rebounz.login.beans.Account;
import com.rebounz.login.dao.AccountStmtCreator;
import com.rebounz.login.util.Constants;

public class AccountStmtCreatorImpl implements AccountStmtCreator {

	/** used for Logging. */
	private static final Log LOGGER = LogFactory
			.getLog(AccountStmtCreatorImpl.class);

	public PreparedStatementCreator updateUserDetail(final String sql,
			final Account accountDetails) throws SQLException {
		PreparedStatementCreator psc1 = new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(
					final Connection conn) throws SQLException {
				PreparedStatement statement = conn.prepareStatement(sql);
				statement.setString(Constants.ONE,
						accountDetails.getFirstname());
				statement
						.setString(Constants.TWO, accountDetails.getLastname());
				statement.setString(Constants.THREE, accountDetails.getEmail());
				statement
						.setString(Constants.FOUR, accountDetails.getCountry());
				statement.setString(Constants.FIVE, accountDetails.getState());
				statement.setString(Constants.SIX, accountDetails.getZipCode());
				statement.setString(Constants.SEVEN,
						accountDetails.getUsername());
				return statement;
			}
		};
		return psc1;
	}

	@Override
	public PreparedStatementCreator updateAccountDetail(final String sql,
			final Account accountDetails) throws SQLException {
		PreparedStatementCreator psc2 = new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(
					final Connection conn) throws SQLException {
				PreparedStatement statement = conn.prepareStatement(sql);
				statement
						.setString(Constants.ONE, accountDetails.getCardName());
				statement.setString(Constants.TWO,
						accountDetails.getCardNumber());
				statement.setString(Constants.THREE,
						accountDetails.getPayementMode());
				statement.setString(Constants.FOUR,
						accountDetails.getPayementType());
				statement.setString(Constants.FIVE,
						accountDetails.getExpireMonth());
				statement.setString(Constants.SIX,
						accountDetails.getExpireYear());
				statement.setString(Constants.SEVEN,
						accountDetails.getUsername());

				return statement;
			}
		};
		return psc2;
	}

}
