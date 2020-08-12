package com.go.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.go.dao.LoginDao;
import com.go.model.Account;
@WebServlet("/login")
public class LoginController extends HttpServlet {

	private LoginDao loginDao;
	public void init() {
		loginDao =new LoginDao();
				
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		RequestDispatcher rq = request.getRequestDispatcher("views/login.jsp");
		rq.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String username =request.getParameter("username");
		String password =request.getParameter("password");
		Account account=new Account();
		account.setUsername(username);
		account.setPassword(password);
		
		if(loginDao.validate(account)) {
			response.sendRedirect(request.getContextPath() + "/home");
		}
		else {
			response.sendRedirect(request.getContextPath()  + "/login");
		}
	}
}
