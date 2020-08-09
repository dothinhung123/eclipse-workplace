package com.go.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.go.config.JDBCConnection;
import com.go.model.Account;

public class LoginDao {

	public boolean validateAccount(Account account) {
		boolean status = false;
		String sql = "select * from account where username=? and password =?";
		Connection connection = null;
		ResultSet result = null;
		
		// get connection
		
		//PREPARE STATEMENT
				PreparedStatement statement = null;
				try {
					connection =JDBCConnection.getConnection();
					   statement=connection.prepareStatement(sql);
						statement.setString(1, account.getUsername());
						statement.setString(2, account.getPassword());
						//execute
						result =statement.executeQuery();
						//return true;
						status = result.next();
						
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			// mapping
				
				return status;
		
		
		
	}

}
