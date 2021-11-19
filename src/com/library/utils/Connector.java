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
					System.out.println("Logged In Successfully");
					System.out.println(rs.getNString(4));
					loggedIn = true;
				}
				else{
					System.out.println("Bad Credentials");
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
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getInt(6) + " " + rs.getString(7) + " " + rs.getInt(8));
				
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
	
	public static void bookCheckOut(){
		boolean isAvailable = false;
		
		try{
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project", "root", "D7i4FjL10!");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM book_available");

			while(rs.next()){
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getInt(6) + " " + rs.getString(7) + " " + rs.getInt(8));
				
			}
			con.close();
		}
		catch(Exception e){}
	}
	
	public static void bookReturn(){
		boolean isAvailable = false;
		
		try{
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project", "root", "D7i4FjL10!");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM book_available");

			while(rs.next()){
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getInt(6) + " " + rs.getString(7) + " " + rs.getInt(8));
				
			}
			con.close();
		}
		catch(Exception e){}
	}
	
	public static void main(String [] args){
		Connector.bookAvailable();
	}
}