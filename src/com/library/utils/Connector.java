package com.library.utils;

import java.sql.*;

public class Connector{
	public static boolean verifyAdmin(String user, String pass){
		boolean loggedIn = false;

		try{
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project", "root", "D7i4FjL10!");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM admin_table WHERE username = '" + user + "'");

			while(rs.next()){
				if(pass.equals(rs.getString(4).toString())){
					loggedIn = true;
				}
				else{
					loggedIn = false;
				}
			}
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return loggedIn;
	}

	public static boolean bookAvailable(){
		boolean isAvailable = false;

		try{
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project", "root", "D7i4FjL10!");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM book_available");

			while(rs.next()){
				if(rs.getInt(0) == 1){
					isAvailable = true;
				}
				else{
					isAvailable = false;
				}
			}
			con.close();
		}
		catch(Exception e){}

		return isAvailable;
	}

	public static boolean bookCheckOut(int checkOutISBN){
		boolean checkedOut = false;

		try{
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project", "root", "D7i4FjL10!");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM book_available");

			while(rs.next()){
				if(rs.getInt(6) > 1){
					stmt.executeLargeUpdate("UPDATE book_available SET num_copies = " + (rs.getInt(6) - 1) + ", num_checkedout = " + (rs.getInt(7) + 1) + " where isbn = " + checkOutISBN);
					checkedOut = true;
				}
				if(rs.getInt(6) == 1){
					stmt.executeLargeUpdate("UPDATE book_available SET num_copies = " + (rs.getInt(6) - 1) + ", num_checkedout = " + (rs.getInt(7) + 1) + ", is_available = " + 0 + " where isbn = " + checkOutISBN);
					checkedOut = true;
				}
				if(rs.getInt(6) == 0){
					checkedOut = false;
				}
			}
			con.close();
		}
		catch(Exception e){}
		return checkedOut;
	}
	
	public static boolean bookReturn(int checkInISBN){
		boolean checkIn = false;
		
		try{
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project", "root", "D7i4FjL10!");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM book_available");

			while(rs.next()){
				if(rs.getInt(8) == 0){
					stmt.executeLargeUpdate("UPDATE book_available SET num_copies = " + (rs.getInt(6) + 1) + ", num_checkedout = " + (rs.getInt(7) - 1) + ", is_available = " + 1 + " where isbn = " + checkInISBN);
					checkIn = true;
				}
				if(rs.getInt(8) == 1){
					stmt.executeLargeUpdate("UPDATE book_available SET num_copies = " + (rs.getInt(6) + 1) + ", num_checkedout = " + (rs.getInt(7) - 1) + " where isbn = " + checkInISBN);
					checkIn = true;
				}
				else{
					checkIn = false;
				}
			}
			con.close();
		}
		catch(Exception e){}
		return checkIn;
	}

	public static void main(String [] args){
		Connector.bookAvailable();
		Connector.bookReturn(23456);
		Connector.bookAvailable();
	}
}