package com.go.controller;

import java.io.IOException;

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
	private EmployeeDao employeeDao;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void init() {
		employeeDao = new EmployeeDao();
	}
	protected void doGet(HttpServletRequest request , HttpServletResponse response)throws ServletException, IOException {
		request.setAttribute("employees", employeeDao.getAllEmployees());
		System.out.println("I miss you");
		RequestDispatcher rq = request.getRequestDispatcher("views/crud.jsp");
		rq.forward(request, response);
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//		String name = request.getParameter("name");
//		String email = request.getParameter("email");
//		String address = request.getParameter("address");
//		String phone = request.getParameter("phone");
//		Employee e = new Employee();
//		e.setName(name);
//		e.setEmail(email);
//		e.setPhone(phone);
//		e.setAddress(address);
//		employeeDao.add(e);
		if(request.getParameterMap().containsKey("id") && request.getParameterMap().containsKey("name") && 
				request.getParameterMap().containsKey("email") && request.getParameterMap().containsKey("address") 
				&& request.getParameterMap().containsKey("phone")) {
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String address = request.getParameter("address");
			String phone = request.getParameter("phone");
			String id = request.getParameter("id");
			Employee e = new Employee();
			e.setId(id);
			e.setName(name);
			e.setEmail(email);
			e.setPhone(phone);
			e.setAddress(address);
			employeeDao.edit(e);
			
		}
		else if(request.getParameterMap().containsKey("name") && 
				request.getParameterMap().containsKey("email") && request.getParameterMap().containsKey("address") 
				&& request.getParameterMap().containsKey("phone")) {
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String address = request.getParameter("address");
			String phone = request.getParameter("phone");
			Employee e = new Employee();
			e.setName(name);
			e.setEmail(email);
			e.setPhone(phone);
			e.setAddress(address);
			employeeDao.add(e);
			
		}
		else if(request.getParameterMap().containsKey("id")) {
			String id = request.getParameter("id");
			employeeDao.delete(id);
		}
		response.sendRedirect(request.getContextPath() + "/home");
	}

}
