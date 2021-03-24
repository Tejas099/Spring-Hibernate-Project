package com.projectaptech.service;

import com.projectaptech.DAO.UserDAO;
import com.projectaptech.entities.User;

public class UserService {
	
	UserDAO userDAO = new UserDAO();
	
	public void addUser(User user)
	{
		//business logic for entities are correct 
		//Call data access object(DAO) to insert data 
		userDAO.addUser(user);
	}
}
