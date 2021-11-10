package com.library.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.library.bean.Administrator;
import com.library.dao.AdministratorDao;
import com.library.exception.BaseException;

@WebServlet(name = "adminlogin", urlPatterns = {"/adminlogin"})
public class AdminLoginServlet extends HttpServlet{
	
	public AdminLoginServlet(){
		super();
	}
	
	
}