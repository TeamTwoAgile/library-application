package com.library.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.bean.Book;
import com.library.utils.JDBCUtils;

public class DashboardService {

	public static List<Book> getBooksForCustomerDashboard(){
		String query = "SELECT * FROM book";
		
		List<Book> result = new ArrayList<Book>();
		
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = JDBCUtils.getConnection();
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()) {
				Book book = new Book();
				book.setName(rs.getString("name"));
				book.setAuthor(rs.getString("author"));
				book.setType(rs.getString("type"));
				result.add(book);
			}
			
			return result;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static List<Book> getBooksForAdminDashboard(){
		String query = "SELECT * FROM book";
		
		List<Book> result = new ArrayList<Book>();
		
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = JDBCUtils.getConnection();
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()) {
				Book book = new Book();
				book.setName(rs.getString("name"));
				book.setAuthor(rs.getString("author"));
				book.setType(rs.getString("type"));
				result.add(book);
			}
			
			return result;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
