package com.wangzunbin._01_hello;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloKittyServlet implements Servlet{

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init");
	}

	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig");
		return null;
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service");
		
	}

	public String getServletInfo() {
		System.out.println("getServletInfo");
		return null;
	}

	public void destroy() {
		System.out.println("init");
		
	}



}
