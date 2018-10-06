package com.nagarro.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.nagarro.beans.User;
import com.nagarro.beans.UserDatabase;
import com.nagarro.constants.Constants;
import com.nagarro.util.HibernateUtil;


public class AuthenticateUser {
public void findUser(UserDatabase user){
	System.out.println("Finding user..");

	HibernateUtil hibernateUtil=new HibernateUtil();
	Session session=hibernateUtil.createSession();
//	SessionFactory sf=new Configuration().configure(Constants.hibernateFilePath).buildSessionFactory();
//	Session session= sf.openSession();
//	session.beginTransaction();
	Criteria cr = session.createCriteria(User.class);
	Map<String, String> conditions=new HashMap();
	conditions.put("username", user.getUsername());
	conditions.put("pssword",user.getPassword());
	cr.add(Restrictions.allEq(conditions));
	List users = cr.list();
	
	//session.close();
	if(users.size()>0){
	System.out.println("Finding user2..");
	}
	System.out.println("searched");
	}
}
