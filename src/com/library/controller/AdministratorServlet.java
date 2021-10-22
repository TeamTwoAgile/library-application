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


/**
 * Servlet implementation class AdministratorServlet
 */
@WebServlet(name = "register", urlPatterns = { "/register" })
public class AdministratorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AdministratorDao administratorDao = new AdministratorDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdministratorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/administratorregister.jsp");
		dispatcher.forward(request,  response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
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
            e.printStackTrace();
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/administratordetails.jsp");
		dispatcher.forward(request,  response);
		
	}

}
