package com.go;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BeCare extends HttpServlet {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	String m = "I do this, without you";
	response.setContentType("text/html");
	PrintWriter writer = response.getWriter();
	writer.print("<h1>" + m + "</h1>");
	
}
public void doPost(HttpServletRequest request, HttpServletResponse response) {
	
}
}
