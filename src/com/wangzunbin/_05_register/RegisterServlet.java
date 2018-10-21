package com.wangzunbin._05_register;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = -5538004617867204837L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
		System.out.println("调用了doGet()......");
	}
	
	/*@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
		System.out.println("调用了doPost().......");
		String username = req.getParameter("username");
		System.out.println(username);
	}*/
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		super.service(req, res);
		System.out.println("调用了service().......");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String favs = req.getParameter("favs");
		
		System.out.println(username);
		System.out.println(password);
		System.out.println(favs);
		
	}
}
