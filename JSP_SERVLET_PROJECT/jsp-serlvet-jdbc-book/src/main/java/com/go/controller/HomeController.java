package com.go.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.go.dao.EmployeeDao;
import com.go.model.Employee;

@WebServlet("/home")
public class HomeController extends HttpServlet{
	private EmployeeDao employee;

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	public void init() {
		employee = new EmployeeDao();
	}
	protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
		List<Employee> employees = employee.ListAllEmployee();
		request.setAttribute("employees", employees);
		RequestDispatcher rq = request.getRequestDispatcher("views/home.jsp");
		rq.forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		if(request.getParameterMap().containsKey("id") && request.getParameterMap().containsKey("name")&& request.getParameterMap().containsKey("email") && request.getParameterMap().containsKey("address") && request.getParameterMap().containsKey("phone") ) {
	    	String name = request.getParameter("name");
	  	    String email = request.getParameter("email");
	  	    String address = request.getParameter("address");
	  	    String phone = request.getParameter("phone");
	  	    Long id = Long.parseLong(request.getParameter("id"));
	  	    Employee e = new Employee();
	  	    e.setId(id);
	  	    e.setName(name);
	  	    e.setEmail(email);
	  	    e.setAddress(address);
	  	    e.setPhone(phone);
	        employee.updateElement(e);
	     }
	     else if(request.getParameterMap().containsKey("deleteid")) {
	    	 Long deleteid = Long.parseLong(request.getParameter("deleteid"));
	    	 employee.deleteEmployee(deleteid);
	     }
	     else {
	    	 String name = request.getParameter("name");
		  	 String email = request.getParameter("email");
		  	 String address = request.getParameter("address");
		  	 String phone = request.getParameter("phone");
	    	 Employee e = new Employee();
	  	     e.setName(name);
	  	     e.setEmail(email);
	  	     e.setAddress(address);
	  	     e.setPhone(phone);
	    	 employee.insertElement(e);
	     }
	    
	   
	    
	    response.sendRedirect(request.getContextPath()+"/home");
	}

}
