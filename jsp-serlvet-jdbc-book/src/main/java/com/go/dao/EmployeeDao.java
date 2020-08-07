package com.go.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.go.config.JDBCConnection;
import com.go.model.Employee;

public class EmployeeDao {
	private Connection connection;
	public EmployeeDao() {
		connection  = JDBCConnection.getConnection();
	}
	public List<Employee> ListAllEmployee() {
		String sql = "select * from employee ";
		PreparedStatement statement = null;
		ResultSet result = null;
		List<Employee> employees = new ArrayList<Employee>();
		//create connection
		//init preparedstatement 
		try {
			statement = connection.prepareStatement(sql);
			//EXECUTE query
		    result=	statement.executeQuery();
		    while(result.next()) {
		    	Long id  = result.getLong("id");
		    	String name = result.getString("name");
		    	String address = result.getString("address");
		    	String phone=result.getString("phone");
		    	
		    	String email  = result.getString("email");
		    	Employee e  = new Employee (id,name,email,address,phone);
		    	employees.add(e);
		    }
		   
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//map
		//
		return employees;
		
		
	}
	public void insertElement(Employee employee) {
		String sql = "insert into  employee(name,email,address,phone) values(?,?,?,?)";
		PreparedStatement statement = null;
		
		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, employee.getName());
			statement.setString(2, employee.getEmail());
			statement.setString(3, employee.getAddress());
			statement.setString(4, employee.getPhone());
			//execute query
			statement.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void updateElement(Employee empl) {
		String sql = "update employee set name=?,email=?,address=?,phone=? where id=?";
		PreparedStatement statement =null;
		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1,empl.getName() );
			statement.setString(2, empl.getEmail());
			statement.setString(3, empl.getAddress());
			statement.setString(4, empl.getPhone());
			statement.setLong(5, empl.getId());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void deleteEmployee(Long id) {
		String sql = "delete from employee where id=?";
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sql);
			statement.setLong(1, id);
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public boolean getEmployeeById(Long id) {
		boolean status = false;
		String sql = "select * from  employee  where id =?";
		PreparedStatement statement = null ;
		ResultSet result = null;
		try {
			statement = connection.prepareStatement(sql);
			statement.setLong(1, id);
			result =statement.executeQuery();
			status = result.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
//		statement.setLong(1, "id");
		
	}
}
