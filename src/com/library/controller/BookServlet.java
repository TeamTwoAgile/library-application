package com.library.controller;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.bean.Book;
import com.library.dao.BookDao;
import com.mysql.cj.util.StringUtils;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet(name = "addBook", urlPatterns = { "/addBook" }) 
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BookDao bookDao = new BookDao();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BookServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/book.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		Book book = new Book();
		String name = request.getParameter("name");
		String author = request.getParameter("author");
		String type = request.getParameter("type");
		
		
		String nameRegEx = "[0-9a-zA-Z_ ]{2,25}";
		boolean isNameMatch = Pattern.matches(nameRegEx, name);

		String msg = "";
		if (!isNameMatch) {
			msg += "Book name length should between 2 to 25;<br>";
		}

		String authorRegEx = "[a-zA-Z_ ]{2,25}";
		boolean isPasswordMatch = Pattern.matches(authorRegEx, author);

		if (!isPasswordMatch) {
			msg += "Author length should between 2 to 25;<br>";
		}
		
		if (!StringUtils.isNullOrEmpty(msg)) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/book.jsp");
			request.setAttribute("msg", "Register failed :<br>  " + msg);
			dispatcher.forward(request, response);
			return;
		}
		
		book.setAuthor(author);
		book.setName(name);
		book.setType(type);

		try {
			bookDao.addBook(book);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/book.jsp");
			String message = e.getMessage();
			request.setAttribute("msg", "Add book failed :  "+e.getMessage());
			dispatcher.forward(request, response);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/bookdetails.jsp");
		dispatcher.forward(request, response);
	}

}
