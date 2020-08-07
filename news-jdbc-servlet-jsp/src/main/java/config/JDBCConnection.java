package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	private static String url="jdbc:mysql://localhost:3306/news?useSSL=false";
	private static String username="root";
	private static String password="11111";
	
	public static Connection getConnection() throws SQLException {
		//Init connection
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// connect to url
			connection = DriverManager.getConnection(url, username, password);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
