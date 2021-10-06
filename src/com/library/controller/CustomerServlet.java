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

@WebServlet("/register")
public class CustomerServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private CustomerDao customerDao = new CustomerDao();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet(){
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/customerregister.jsp");
		dispatcher.forward(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title"), firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName"), sex = request.getParameter("sex");
        String address = request.getParameter("address"), contact = request.getParameter("contact");
        String dob = request.getParameter("DoB"), carddetails = request.getParameter("cardDetails");
        String username = request.getParameter("username"), password = request.getParameter("password");

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

        try{
        	customerDao.registerCustomer(customer);
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/customerdetails.jsp");
		dispatcher.forward(request,  response);
	}
}