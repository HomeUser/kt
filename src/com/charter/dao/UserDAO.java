package com.charter.dao;

import com.charter.model.User;

public class UserDAO {
	public boolean isFound(User u) {
		return (u!=null ? true:false);
	}
}	//	end of class UserDAO
