package com.library.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.library.bean.Customer;

public class CustomerDao {
	
	public int registerCustomer(Customer customer) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO customers" +
            "  (id,title, first_name, last_name, sex, address, contact, dob, card_details, username, password) VALUES " +
            " (?, ?, ?, ?, ?,?,?,?,?,?,?);";
        
        String SELECT_USER_ID="select id from customers where id=(select MAX(id) from customers);";

        int result = 0;
        ResultSet newresult;
        int id=0;

        Class.forName("com.mysql.jdbc.Driver");
        
        
        
        
        try (Connection connection = DriverManager
                //	.getConnection("jdbc:mysql://localhost:3306/mysql_database?useSSL=false", "root", "root"); 
                    .getConnection("jdbc:mysql://localhost:3306/customer_db?useSSL=false&allowPublicKeyRetrieval=true", "root","eloviano");
        		 PreparedStatement preparedStatement1 = connection.prepareStatement(SELECT_USER_ID)) {
        		 System.out.println(preparedStatement1);
            	// Step 3: Execute the query or update query
        		 newresult = preparedStatement1.executeQuery();
        		 while(newresult.next()) {
        			 id=newresult.getInt("id");
        		 }
            	System.out.println();
            	connection.close();	
                } catch (SQLException e) {
                    // process sql exception
                	e.printStackTrace();
                   // printSQLException(e);
                }finally{
                	
                }
        
        try (Connection connection = DriverManager
                //	.getConnection("jdbc:mysql://localhost:3306/mysql_database?useSSL=false", "root", "root"); 
                    .getConnection("jdbc:mysql://localhost:3306/customer_db?useSSL=false&allowPublicKeyRetrieval=true", "root","eloviano");
        			     	
                    // Step 2:Create a statement using connection object
                    PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
                    preparedStatement.setInt(1,id+1);
                    preparedStatement.setString(2, customer.getTitle());
                    preparedStatement.setString(3, customer.getFirstName());
                    preparedStatement.setString(4, customer.getLastName());
                    preparedStatement.setString(5, customer.getSex());
                    preparedStatement.setString(6, customer.getAddress());
                    preparedStatement.setString(7, customer.getContact());
                    preparedStatement.setString(8, customer.getDoB());
                    preparedStatement.setString(9, customer.getCardDetails());
                    preparedStatement.setString(10, customer.getUsername());
                    preparedStatement.setString(11, customer.getPassword());
      

                    System.out.println(preparedStatement);
                    // Step 3: Execute the query or update query
                    result = preparedStatement.executeUpdate();

                } catch (SQLException e) {
                    // process sql exception
                	e.printStackTrace();
                   // printSQLException(e);
                }
                return result;
            }
        	
        	

         //   private void printSQLException(SQLException ex) {
         //       for (Throwable e: ex) {
           //         if (e instanceof SQLException) {
           //             e.printStackTrace(System.err);
           //             System.err.println("SQLState: " + ((SQLException) e).getSQLState());
           //             System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
          //              System.err.println("Message: " + e.getMessage());
          //              Throwable t = ex.getCause();
          //              while (t != null) {
          //                  System.out.println("Cause: " + t);
            //                t = t.getCause();
             //           }
             //       }
             //   }
          //  }
        	/*
        	public int registerEmployee(Employee employee) throws ClassNotFoundException {
                String INSERT_USERS_SQL = "select * from employees";

                int result = 0;

                Class.forName("com.mysql.jdbc.Driver");

                try (Connection connection = DriverManager
                //	.getConnection("jdbc:mysql://localhost:3306/mysql_database?useSSL=false", "root", "root");
                    .getConnection("jdbc:mysql://localhost:3306/employees?useSSL=false&allowPublicKeyRetrieval=true", "root", "root");
                		

                    // Step 2:Create a statement using connection object
                    PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
                   

                    System.out.println(preparedStatement);
                    // Step 3: Execute the query or update query
                    result = preparedStatement.executeUpdate();
                    
                    System.out.print("");

                } catch (SQLException e) {
                    // process sql exception
                	e.printStackTrace();
                   // printSQLException(e);
                }
                return result;
            }
            */

}
