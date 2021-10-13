package com.library.bean;

public class AdminLogin{
	public String adminUser = "", adminPass = "";

	public AdminLogin(){}

	public String getUser(){
		return adminUser;
	}

	public void setUser(String adminUser){
		this.adminUser = adminUser;
	}

	public String getPass(){
		return adminPass;
	}

	public void setPass(String adminPass){
		this.adminPass = adminPass;
	}
	
	// "SELECT * FROM administrator WHERE user_name = adminUser"
}