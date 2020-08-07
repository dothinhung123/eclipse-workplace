package com.go.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.go.model.Employee;
@WebServlet("/home")
public class HomeController extends HttpServlet {
	private List<Employee> employees =new LinkedList<Employee>();

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
		request.setAttribute("employees", employees);
		RequestDispatcher rq = request.getRequestDispatcher("views/crud.jsp");
		rq.forward(request, response);
		
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException{
		String name = request.getParameter("name");
		String email=request.getParameter("address");
		String address = request.getParameter("email");
		String phone = request.getParameter("phone");
		Integer id = Integer.parseInt(request.getParameter("id"));
		
			Employee e = new Employee();
			e.setName(name);
			e.setAddress(address);
			e.setEmail(email);
			e.setPhone(phone);
			employees.add(e);
		
		response.sendRedirect(request.getContextPath() +"/home");
		
	}
   
          
//	public static int findObject(int wanted,List<Employee> employees) {
//		    
//			  for(int i = 0; i<employees.size(); i++){
//				  int index ;
//			    if(employees.get(i).id ==wanted){
//			      index = i;
//			    }
//			  }
//			 
//			
//	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException{
		String name = request.getParameter("name");
		String email=request.getParameter("address");
		String address = request.getParameter("email");
		String phone = request.getParameter("phone");
		int id = Integer.parseInt(request.getParameter("id"))-1;
		
		
		
	}

}
