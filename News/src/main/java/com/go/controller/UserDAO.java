package com.go.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	
public Connection getConnection() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/news?useSSL=false";
		String username = "root";
		String password = "11111";
		return DriverManager.getConnection(url,username,password);
		
	}catch(ClassNotFoundException | SQLException e) {
		return null;
	}
	
}
public boolean validate(UserModel user) {
	boolean status = false;
	String sql  = "select * from account where username =? and password=?";
	Connection connection = getConnection();
	PreparedStatement statement = null;
	ResultSet resultSet = null;
	if(connection!=null) {
			try {
				statement = connection.prepareStatement(sql);
				resultSet  = statement.executeQuery();
				while(resultSet.next()) {
					//mapping
					user = new UserModel();
					user.setPassword(resultSet.getString("password"));
					user.setUsername(resultSet.getString("username"));
					
					status = true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
	}
	
	return status;
}
	

}
