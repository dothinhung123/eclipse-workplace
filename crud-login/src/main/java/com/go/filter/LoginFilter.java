package com.go.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {
   private ServletContext context ;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		context = filterConfig.getServletContext();
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
	    String url=httpRequest.getServletPath();
	    HttpSession session = httpRequest.getSession();
		if(url.contains(".jsp") || !url.contains("error.jsp")) {
			RequestDispatcher rq = httpRequest.getRequestDispatcher("views/error.jsp");
			rq.forward(httpRequest, httpResponse);
		}
		
		
		chain.doFilter(httpRequest, httpResponse);
	
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
