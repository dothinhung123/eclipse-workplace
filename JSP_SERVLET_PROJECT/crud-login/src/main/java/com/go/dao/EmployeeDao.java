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
	
	public List<Employee> getAllEmployees(){
		Connection connection = null;
		ResultSet result =null;
		PreparedStatement statement = null;
		String sql = "select * from employee";
		List<Employee> employee = new ArrayList<>();
		connection = JDBCConnection.getConnection();
       try {
		statement = connection.prepareStatement(sql);
		result = statement.executeQuery();
		while(result.next()) {
			Employee e = new Employee();
			Long id = result.getLong("id");
			String name= result.getString("name");
			String email = result.getString("email");
			String address = result.getString("address");
			String phone = result.getString("phone");
			e.setId(id);
			e.setEmail(email);
			e.setAddress(address);
			e.setPhone(phone);
			e.setName(name);
			employee.add(e);
		}
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
       return employee;	
		
		
	}

}
