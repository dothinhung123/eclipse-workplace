
package com.go.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	private static String url="jdbc:postgresql://localhost:5432/employee";
	private static String username="postgres";
	private static String password ="11111";
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
//			Class.forName("com.mysql.jdbc.Driver");
		Class.forName("org.postgresql.Driver");
		connection=	DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		
	}

}
