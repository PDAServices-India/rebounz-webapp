package com.rebounz.login.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.PreparedStatementCreator;
import com.rebounz.login.beans.User;
import com.rebounz.login.dao.UserStmtCreator;
import com.rebounz.login.util.Constants;

public class UserStmtCreatorImpl implements UserStmtCreator {

    /** used for Logging. */
	private static final Log LOGGER = LogFactory.getLog(UserStmtCreatorImpl.class);
	
	@Override
	public PreparedStatementCreator userRegistration(final String sql,
			final User userDetails) throws SQLException {
		PreparedStatementCreator psc = new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(
                    final Connection conn) throws SQLException {
                PreparedStatement statement = conn.prepareStatement(sql);
                try {
                    statement.setString(Constants.ONE, userDetails.getUsername());
                    statement.setString(Constants.TWO, userDetails.getPassword());
                    statement.setString(Constants.THREE, userDetails.getFirstname());
                    statement.setString(Constants.FOUR, userDetails.getLastname());
                    statement.setString(Constants.FIVE, userDetails.getEmail());
                    statement.setString(Constants.SIX, userDetails.getCountry());
                    statement.setString(Constants.SEVEN, userDetails.getState());
                    statement.setString(Constants.EIGHT, userDetails.getZipCode());
                } catch (SQLException e) {
                    LOGGER.error(e.getMessage(), e);
                }
                return statement;
            }
        };
        return psc;
	}

	public PreparedStatementCreator statusCheck(final String sql,
			final String userName) throws SQLException {
		PreparedStatementCreator psc = new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(
                    final Connection conn) throws SQLException {
                PreparedStatement statement = conn.prepareStatement(sql);
                try {
                    statement.setString(Constants.ONE, userName);
                } catch (SQLException e) {
                    LOGGER.error(e.getMessage(), e);
                }
                return statement;
            }
        };
        return psc;
	}

	@Override
	public PreparedStatementCreator updatePwdStatus(final String sql,
			final User loginDetails) throws SQLException {
		PreparedStatementCreator psc = new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(
                    final Connection conn) throws SQLException {
                PreparedStatement statement = conn.prepareStatement(sql);
                try {
                    statement.setString(Constants.ONE, loginDetails.getPasswordNew());
                    statement.setString(Constants.TWO, "Active");
                    statement.setString(Constants.THREE, loginDetails.getUsername());
                } catch (SQLException e) {
                    LOGGER.error(e.getMessage(), e);
                }
                return statement;
            }
        };
        return psc;
	}
	

}
