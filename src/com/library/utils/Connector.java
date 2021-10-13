package com.library.utils;

import java.sql.*;

public class Connector{
	public static void databaseConnector(){
		try{
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/customer","root","D7i4FjL10!");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM administrator");
			
			while(rs.next()){
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String[] args){
		Connector.databaseConnector();
	}
}