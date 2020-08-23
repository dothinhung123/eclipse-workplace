package com.go.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	private static String url="jdbc:mysql://localhost:3306/employee?useSSL=false";
	private static String user="root";
	private static String password="11111";
	
	public static Connection getConnection() {
		
		
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection =DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		
	}
	

}
