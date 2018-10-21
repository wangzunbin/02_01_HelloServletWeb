package com.wangzunbin._07_reponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RespServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.service(req, resp);
		ServletOutputStream outputStream = resp.getOutputStream();
		PrintWriter writer = resp.getWriter();
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html");
		//上面的方法可以简写成下面的代码
		resp.setContentType("text/html;charset=utf-8");
	}
}
