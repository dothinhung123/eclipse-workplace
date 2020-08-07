package com.go.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.go.configure.JdbcConnection;
import com.go.model.Login;


public class LoginDao {
public boolean validate(Login user) {
	boolean status = false;
	String sql = "select * from login where username =? and password=? ";
	PreparedStatement statement = null;
	ResultSet rs = null;
	Connection connection = null;
	// init statement
	try {
		connection = JdbcConnection.getConnection();
	   statement=connection.prepareStatement(sql);
		statement.setString(1, user.getUsername());
		statement.setString(2, user.getPassword());
		//execute
		rs =statement.executeQuery();
		//return true;
		status = rs.next();
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return status;
	
	
	
}
}
