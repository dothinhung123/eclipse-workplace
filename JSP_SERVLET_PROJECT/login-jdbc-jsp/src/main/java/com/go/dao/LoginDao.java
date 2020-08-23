package com.go.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.go.config.JDBCConnection;
import com.go.model.User;

public class LoginDao {
	
	public boolean validate(User user) {
		boolean status = false;
		String sql = "select * from login where username=? and password =?";
		Connection connection = null;
		ResultSet result = null;
	// create connection
		connection = JDBCConnection.getConnection();
		
		//preparedStatemnt
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			// mapp
			result = statement.executeQuery();
			status = result.next();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//
		return status;

	}

}
