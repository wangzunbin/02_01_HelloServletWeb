package com.wangzunbin._02_init;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class InitServlet implements Servlet{

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
//		Enumeration names = config.getInitParameterNames();
		String encoding = config.getInitParameter("encoding");
		String name = config.getInitParameter("name");
		System.out.println(encoding + "," + name);
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
