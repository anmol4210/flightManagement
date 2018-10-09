package com.nagarro.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.nagarro.models.User;
import com.nagarro.util.HibernateUtil;


public class AuthenticateUser {
public boolean findUser(User user){
	System.out.println("Finding user..");

	HibernateUtil hibernateUtil=new HibernateUtil();
	Session session=hibernateUtil.createSession();
	Criteria cr = session.createCriteria(User.class);
	Map<String, String> conditions=new HashMap();
	conditions.put("username", user.getUsername());
	conditions.put("password",user.getPassword());
	cr.add(Restrictions.allEq(conditions));
	List users = cr.list();
	
	//session.close();
	if(users.size()>0){
	
		System.out.println("Finding user2..");
	return true;
	}
	System.out.println("searched");
	
	return false;
	}
}
