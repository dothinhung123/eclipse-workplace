package cnMysql;

import java.sql.*;


public class MysqlC {
	public static void main(String[] args) {
       
		 // creates three different Connection objects
        Connection conn1 = null;
     
 
        try {
            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/fit";
            String user = "root";
            String password = "11111";
 
            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database test");
            }
 
           
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }

}
}
