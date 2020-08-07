package com.go.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/login")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;
    /**
     * Default constructor. 
     */
	  public void init() {
	        userDAO = new UserDAO();
	    }

    public UserController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String username = request.getParameter("username");
	  String password = request.getParameter("password");
	  User user = new User();
	  user.setUsername(username);
	  user.setPassword(password);
	  if(userDAO.validate(user)) {
		RequestDispatcher rq = request.getRequestDispatcher("login.jsp");
		rq.forward(request, response);
	  }
	  else {
		  HttpSession session = request.getSession();
	  }
	}

}
