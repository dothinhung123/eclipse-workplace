package com.go.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	private static String url  = "jdbc:mysql://localhost:3306/login?useSSL=false";
	private static String username="root";
	private static String password ="11111";
	
	public static Connection getConnection() {
		Connection connection = null;
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			connection  = DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return connection;
		 
	}

}
