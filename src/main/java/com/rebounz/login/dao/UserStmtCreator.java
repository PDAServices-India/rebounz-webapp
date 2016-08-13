package com.rebounz.login.dao;

import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementCreator;
import com.rebounz.login.beans.User;;
/**
 * The Interface LoginStmtCreator.
 */
public interface UserStmtCreator {
	
	PreparedStatementCreator userRegistration(final String sql,
			final User userDetails) throws SQLException;

    PreparedStatementCreator statusCheck(final String sql,
            final String userName) throws SQLException;

    PreparedStatementCreator updatePwdStatus(final String sql, 
			final User userDetails) throws SQLException;
    
   
}
