package com.library.controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.library.utils.Connector;

@WebServlet(name = "bookactions", urlPatterns = { "/bookactions" })
public class BookActions extends HttpServlet{
	public BookActions(){
		super();
	}

	public void init(ServletConfig config) throws ServletException{}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.getWriter().append("Served at: ").append(request.getContextPath());

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/bookactions.jsp");
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username");
		String author = request.getParameter("author");
		String[] selected = request.getParameterValues("scales");
		
		for(String check : selected) {
			System.out.println(check);
		}
		
		Connector.findBook(name, author);
	}
}