package com.wangzunbin._06_encoding;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 解决Tomcat请求的中文乱码处理
 * @author Administrator
 *
 */
public class EncodingServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.service(req, resp);
		//1. 方法1对数据ISO-8859-1解码,恢复为二进制
		String username = req.getParameter("username");
		byte[] data = username.getBytes("ISO-8859-1");
		//2. 重新使用UTF-8编码
		username = new String(data, "UTF-8");
		
		/**
		 * 上面的方法 如果入参过多, 过于笨重, 可以使用以下的请求
		 */
		// POST方法:
		req.setCharacterEncoding("UTF-8");
		// Get方式:
		// 要出{TomcatPath}/conf/server.xml,修改请求端口那一栏修改参数
	}
}
