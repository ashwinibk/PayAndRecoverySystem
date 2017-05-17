package com.PayAndRecovery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.PayAndRecovery.IService.IUserLogin;
import com.PayAndRecovery.pojo.User;

@Controller
public class UserLoginController {

@Autowired
IUserLogin UserLogin;
	
	@RequestMapping(value = "/userLogin", method = RequestMethod.GET)
	public @ResponseBody String userLogin(@RequestParam("name") String name, @RequestParam("password") String password){
		
		System.out.println("Name---"+name);
		System.out.println("pass---"+password);
		
		User user=new User();
		
		user.setName(name);
		user.setPassword(password);
		
	   UserLogin.userLogin(user);
		
		System.out.println(user);
		
		
	Boolean result=UserLogin.userLogin(user);
	if(result==true){
			return "User Login Successfully";
		}else{
		
		return "User Login Failed";
		
		}
	}
	
}
