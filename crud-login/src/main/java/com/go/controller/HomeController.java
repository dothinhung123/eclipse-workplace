package com.go.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.go.dao.EmployeeDao;

@WebServlet("/home")
public class HomeController extends HttpServlet{
	private EmployeeDao employeeDao ;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void init() {
		employeeDao = new EmployeeDao();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		request.setAttribute("employees", employeeDao.getAllEmployees());
		RequestDispatcher rq= request.getRequestDispatcher("views/home.jsp");
		rq.forward(request, response);
		
	}
	protected void doPost(HttpServlet request, HttpServletResponse response) throws ServletException,IOException{
		
	}

}
