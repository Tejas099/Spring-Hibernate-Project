package com.projectaptech.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.projectaptech.entities.User;


public class UserDAO {
	
	SessionFactory sessionfactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).buildSessionFactory();
	
	public void addUser(User user)
	{
		Session session = sessionfactory.getCurrentSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();;
	}
}
