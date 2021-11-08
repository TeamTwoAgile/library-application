package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.library.bean.Administrator;
import com.library.exception.BaseException;
import com.library.utils.JDBCUtils;

public class AdministratorDao {

	public int registerAdministrator(Administrator administrator) throws ClassNotFoundException, BaseException {
//		String INSERT_USERS_SQL = "INSERT INTO administrator" + "  (user_name,password,name,email) VALUES "
//				+ " (?, ?, ?, ?);";
		
		String INSERT_USERS_SQL = "INSERT INTO user" + "  (username,password,email,user_type) VALUES(?,?,?,?)";

		if (administrator == null) {
			throw new BaseException("Administrator can not be null");
		} else if (administrator.getUserName() == "" || administrator.getUserName() == null) {
			throw new BaseException("Administrator's userName should not be null");
		} else if (administrator.getPassword() == "" || administrator.getPassword() == null) {
			throw new BaseException("Administrator's password should not be null");
		} else if (administrator.getEmail() == "" || administrator.getEmail() == null) {
			throw new BaseException("Administrator's email should not be null");
		}

		int result = 0;

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = null;
		try {

			// Step 1: Create a connection
//			Connection connection = DriverManager.getConnection(
//					"jdbc:mysql://localhost:3306/library-application?allowPublicKeyRetrieval=true&useSSL=false", "root", "root");

			connection = JDBCUtils.getConnection();

			// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
			preparedStatement.setString(1, administrator.getUserName());
			preparedStatement.setString(2, administrator.getPassword());
			preparedStatement.setString(3, administrator.getEmail());
			preparedStatement.setString(4, administrator.getUserType());

			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			result = preparedStatement.executeUpdate();
			JDBCUtils.closeConnection(connection);
		} catch (SQLException e) {
			JDBCUtils.closeConnection(connection);
			// process sql exception
			e.printStackTrace();
			// printSQLException(e);
		}
		return result;

	}
}
