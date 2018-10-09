package com.nagarro.controllers;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.models.User;
import com.nagarro.service.AuthenticateUser;
import com.nagarro.util.HibernateUtil;

@Controller
public class UserController {
//	@RequestMapping(value="/flightSearch")
//	public String login(){
//		System.out.println("In login");
//		return "flightSearch";
//	}
//	
	 @RequestMapping(value="/",method = RequestMethod.GET)  
	    public ModelAndView login(){  
	         //command is a reserved request attribute name, now use <form> tag to show object data  
	        return new ModelAndView("flightSearch","command",new User());  
	    }  
		
    
	@RequestMapping("/flightSearch")  
    public ModelAndView showform(){  
         //command is a reserved request attribute name, now use <form> tag to show object data  
        return new ModelAndView("flightSearch","command",new User());  
    }  
	
	
	  @RequestMapping(value="/save",method = RequestMethod.POST)  
	    public ModelAndView save(@ModelAttribute("user") User user){  
	        System.out.println("login: "+user.getUsername()+" "+user.getPassword());  

	   AuthenticateUser authuser=new AuthenticateUser();
	     if(authuser.findUser(user)){
	    	 
	    	 return new ModelAndView("flightDetails","command",new User());
	     }
	     else{
	        return new ModelAndView("redirect:/flightSearch");  
	    } 
	     }
}
