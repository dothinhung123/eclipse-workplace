package com.go.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
public Connection getConnection() throws ClassNotFoundException {
	String url = "jdbc:mysql://localhost:3306/login?useSSL=false";
	String username="root";
	String password ="11111";
	Connection connection=null;
	Class.forName("com.mysql.jdbc.Driver");
	try {
		 connection = DriverManager.getConnection(url,username,password)
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return connection;
}
public boolean validate(User user) {
	String sql = "select * from login where username=? and password=?";
	boolean status = false;
	PreparedStatement preparedStatement = null;
	ResultSet result = null;
	try {
		preparedStatement = getConnection().prepareStatement(sql);
		preparedStatement.setString(1, user.getUsername());
		preparedStatement.setString(2, user.getPassword());
		result = preparedStatement.executeQuery();
		System.out.print(preparedStatement);
		status = result.next();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return status;
	
}

}
