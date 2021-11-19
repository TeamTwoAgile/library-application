package com.library.controller;

import java.io.IOException;
import java.util.regex.Pattern;

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
import com.mysql.cj.util.StringUtils;

@WebServlet(name = "register", urlPatterns = { "/register" })
public class AdministratorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AdministratorDao administratorDao = new AdministratorDao();

	public AdministratorServlet() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/administratorregister.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String userType = request.getParameter("userType");

		String userNameRegEx = "[0-9a-zA-Z_ ]{6,12}";
		boolean isUserNameMatch = Pattern.matches(userNameRegEx,username);

		String msg = "";
		if (!isUserNameMatch) {
			msg += "Usename length should between 6 to 12;<br>";
		}

		String passwordRegEx = "[0-9a-zA-Z_]{6,12}";
		boolean isPasswordMatch = Pattern.matches(passwordRegEx, password);

		if (!isPasswordMatch) {
			msg += "Password length should between 6 to 12;<br>";
		}

		String emailRegEx = "^([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)*@([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)+[\\.][A-Za-z]{2,3}([\\.][A-Za-z]{2})?$";
		boolean isEmailMatch = Pattern.matches(emailRegEx, email);

		if (!isEmailMatch) {
			msg += "Please input correct email @ ;<br>";
		}
		
		String phoneRegEx="[0-9]{9}";
		boolean isPhoneRegEx = Pattern.matches(phoneRegEx, phone);
		if (!isPhoneRegEx) {
			msg += "Phone number lenth should be 9 and should be all numbers;<br>";
		}
		
		String addressRegEx="[0-9a-zA-Z_]{5,30}";
		boolean isAddressRegEx = Pattern.matches(addressRegEx, phone);
		if (!isAddressRegEx) {
			msg += "Address length should between 5 to 30 ;<br>";
		}


		if (!StringUtils.isNullOrEmpty(msg)) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/administratorregister.jsp");
			request.setAttribute("msg", "Register failed :<br>  " + msg);
			dispatcher.forward(request, response);
			return;
		}

		
		Administrator administrator = new Administrator();
		administrator.setUserName(username);
		administrator.setPassword(password);
//        administrator.setName(name);
        administrator.setEmail(email);
        administrator.setPhone(phone);
        administrator.setAddress(address);

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
            e.printStackTrace();
        }
       
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/administratordetails.jsp");
		dispatcher.forward(request,  response);
	}
}