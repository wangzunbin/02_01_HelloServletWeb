package com.wangzunbin._04_request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestServlet extends HttpServlet {

	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 推荐使用这个
	 */
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
		String contextPath = req.getContextPath();
//		req.getHeader(name)
		String requestURI = req.getRequestURI();
		StringBuffer requestURL = req.getRequestURL();
		String remoteAddr = req.getRemoteAddr();
		System.out.println(contextPath);
		System.out.println(requestURI);
		System.out.println(requestURL);
		System.out.println(remoteAddr);
	}
	
/*	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		String contextPath = req.getContextPath();
//		req.getHeader(name)
		String requestURI = req.getRequestURI();
		StringBuffer requestURL = req.getRequestURL();
		String remoteAddr = req.getRemoteAddr();
		System.out.println(contextPath);
		System.out.println(requestURI);
		System.out.println(requestURL);
		System.out.println(remoteAddr);
	}*/
}
