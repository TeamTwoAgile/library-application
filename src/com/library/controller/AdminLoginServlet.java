package com.library.controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.library.bean.AdminLogin;
import com.library.utils.Connector;

@SuppressWarnings("serial")
@WebServlet(name = "adminlogin", urlPatterns = {"/adminlogin"})
public class AdminLoginServlet extends HttpServlet{
	
	public AdminLoginServlet(){
		super();
	}
	
	public void init(ServletConfig config) throws ServletException{}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/adminlogin.jsp");
		dispatcher.forward(request,  response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String username = request.getParameter("username"), password = request.getParameter("password");
		
		AdminLogin a = new AdminLogin(username, password);
		Connector.verifyAdmin(a.getUser(), a.getPass());
	}
}