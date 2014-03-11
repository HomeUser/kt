package com.charter.model;

public class User {
	private String userName, password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean isAuthenticated() {
		return (userName!=null && password!=null) ? true:false;
	}
}	//	end  of class User
