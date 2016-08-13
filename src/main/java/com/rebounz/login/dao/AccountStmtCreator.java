package com.rebounz.login.dao;

import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementCreator;
import com.rebounz.login.beans.Account;

/**
 * The Interface LoginStmtCreator.
 */
public interface AccountStmtCreator {


	PreparedStatementCreator updateUserDetail(final String sql,
			final Account accountDetails) throws SQLException;
	
	PreparedStatementCreator updateAccountDetail(final String sql,
			final Account accountDetails) throws SQLException;


}
