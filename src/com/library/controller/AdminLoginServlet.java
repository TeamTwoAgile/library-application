package com.library.controller;
import com.library.bean.AdminLogin;
import com.library.utils.Connector;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet(name = "adminlogin", urlPatterns = {"/adminlogin"})
public class AdminLoginServlet extends HttpServlet{
	public AdminLoginServlet(){
		super();
	}

	public void init(ServletConfig config) throws ServletException{}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/adminlogin.jsp");
		dispatcher.forward(request,  response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String username = request.getParameter("username"), password = request.getParameter("password");
		AdminLogin a = new AdminLogin(username, password);
		boolean loggedIn = Connector.verifyAdmin(a.getUser(), a.getPass());

		if(loggedIn == true){
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/book.jsp");
      dispatcher.forward(request,  response);
		}
		else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/adminlogin.jsp");
			dispatcher.forward(request,  response);
		}
	}
}