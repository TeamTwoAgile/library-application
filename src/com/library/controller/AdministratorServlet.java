package com.library.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.library.bean.Administrator;
import com.library.dao.AdministratorDao;
import com.library.exception.BaseException;

@WebServlet(name = "register", urlPatterns = { "/register" })
public class AdministratorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AdministratorDao administratorDao = new AdministratorDao();
       
	public AdministratorServlet() {
        super();
    }

	public void init(ServletConfig config) throws ServletException{
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/administratorregister.jsp");
		dispatcher.forward(request,  response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String userType=request.getParameter("userType");

        Administrator administrator = new Administrator();
        administrator.setUserName(username);
        administrator.setPassword(password);
//        administrator.setName(name);
        administrator.setEmail(email);

        administrator.setUserType(userType);
        try {
        	// EmployeeDao employeeDao = new EmployeeDao();
        	try {
				administratorDao.registerAdministrator(administrator);
			} catch (BaseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block

        
        try {
        	administratorDao.registerAdministrator(administrator);
        }
        catch (ClassNotFoundException e){

            e.printStackTrace();
            RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/administratorregister.jsp");
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/administratordetails.jsp");
		dispatcher.forward(request,  response);
	}
}