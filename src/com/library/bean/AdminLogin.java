package com.library.bean;

import com.library.utils.Connector;

public class AdminLogin{
	public AdminLogin(String adminUser, String adminPass) {
		this.adminPass = adminPass;
		this.adminUser = adminUser;
	}
	
	public String adminUser = "", adminPass = "";

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
	
	public void adminLogin(){
		Connector.verifyAdmin(getUser(), getPass());
	}
}