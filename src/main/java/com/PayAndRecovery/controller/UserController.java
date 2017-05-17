package com.PayAndRecovery.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.PayAndRecovery.IService.IUserService;
import com.PayAndRecovery.pojo.User;

@SessionAttributes("name")
@Controller
public class UserController {
	
	@Autowired
	private IUserService UserService;
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	


	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
		public @ResponseBody String UserRegister(@RequestParam("name") String name ,@RequestParam("role") String role, @RequestParam("contact") String contact, @RequestParam("email") String email, @RequestParam("password") String password, ModelMap model) {
			
		System.out.println("Name---"+name);
		System.out.println("role --"+ role);
		System.out.println("contact---"+contact);
		System.out.println("email---"+email);
		System.out.println("pass---"+password);
		
		User user=new User();
		
		user.setName(name);
		user.setRole(role);
		user.setContact(contact);
		user.setEmail(email);
        user.setPassword(password);
        
        UserService.userRegister(user);
        
        System.out.println("Data "+user);
        logger.info("Successfully registered");
        
		return "User Succesfully Registerd";
	}
	
		
}	
