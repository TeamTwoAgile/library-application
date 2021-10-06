package com.library.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.bean.Customer;
import com.library.dao.CustomerDao;


/**
 * Servlet implementation class CustomerServlet
 */
//@WebServlet("/CustomerServlet")
@WebServlet("/register")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private CustomerDao customerDao = new CustomerDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub 
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/customerregister.jsp");
		dispatcher.forward(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String title = request.getParameter("title");
		String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String sex = request.getParameter("sex");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");
        String dob = request.getParameter("DoB");
        String carddetails = request.getParameter("cardDetails");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        

        Customer customer = new Customer();
        
        customer.setTitle(title);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setSex(sex);
        customer.setAddress(address);
        customer.setContact(contact);
        customer.setDoB(dob);
        customer.setCardDetails(carddetails);
        customer.setUsername(username);
        customer.setPassword(password);
       

        try {
        	// CustomerDao customerDao = new CustomerDao();
            customerDao.registerCustomer(customer);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/customerdetails.jsp");
		dispatcher.forward(request,  response);
		
	//	doGet(request, response);
	}

}
