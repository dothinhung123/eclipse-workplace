package com.go.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.go.dao.LoginDao;
import com.go.model.Login;

/**
 * Servlet implementation class HomeController
 */
@WebServlet(urlPatterns= {"/home"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private LoginDao loginDao;
	public void init() {
		loginDao = new LoginDao();
	}
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rq = request.getRequestDispatcher("views/login.jsp");
		rq.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		if(username.equals("nhung@gmail.com") && password.equals("nhung")) {
//			response.sendRedirect("views/home.jsp");
//		}
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Login user = new Login();
		user.setUsername(username);
		user.setPassword(password);
		if(loginDao.validate(user)) {
			request.getSession().setAttribute("islogin", true);
        	request.getSession().setAttribute("username",user.getUsername());
			response.sendRedirect(request.getContextPath() +"/change");
		}
		else {
			 HttpSession session = request.getSession();
             session.setAttribute("username", username);
             session.setAttribute("islogin", false);
			response.sendRedirect(request.getContextPath() + "/home");
		
		}
		
	}

}
