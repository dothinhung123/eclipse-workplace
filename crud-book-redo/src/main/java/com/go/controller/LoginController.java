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
		loginDao = new LoginDao();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		RequestDispatcher rq = request.getRequestDispatcher("/views/login.jsp");
		rq.forward(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		Account account = new Account();
		account.setUsername(name);
		account.setPassword(password);
		System.out.print(name+ password);
		if(loginDao.validateAccount(account)) {
			response.sendRedirect(request.getContextPath() + "/home");
		}
	}
	

}
