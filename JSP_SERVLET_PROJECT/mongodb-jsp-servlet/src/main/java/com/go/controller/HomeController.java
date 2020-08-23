////package com.go.controller;
////
////import java.io.IOException;
////
////import javax.servlet.RequestDispatcher;
////import javax.servlet.ServletException;
////import javax.servlet.annotation.WebServlet;
////import javax.servlet.http.HttpServlet;
////import javax.servlet.http.HttpServletRequest;
////import javax.servlet.http.HttpServletResponse;
////
////import com.go.dao.CrudDao;
////import com.go.model.Employee;
////@WebServlet("home")
////public class HomeController extends HttpServlet{
////	
////	/**
////	 * 
////	 */
////	private static final long serialVersionUID = 1L;
////	/**
////	 * 
////	 */
////	
////	
////	private CrudDao crudDao;
////
////	public void init() {
////		crudDao = new CrudDao();
////	}
////	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
////		for(Employee e : crudDao.getAllEmployees()) {
////			System.out.print(e.getName());
////		}
////		RequestDispatcher rq = request.getRequestDispatcher("views/crud.jsp");
////		rq.forward(request, response);
////	}
////
////}
//
//package com.go.controller;
//
//import java.io.IOException;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//@WebServlet("/home")
//public class HomeController extends HttpServlet {
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException{
//		RequestDispatcher rq = request.getRequestDispatcher("views/crud.jsp");
//		rq.forward(request, response);
//	}
//	protected void doPost() throws ServletException , IOException{
//		
//	}
//
//}
