package com.PayAndRecovery.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.PayAndRecovery.IService.IUserService;
import com.PayAndRecovery.pojo.User;

@Qualifier
@Service("UserService")
public  class UserService implements IUserService{

	@Autowired
	MongoTemplate mongoTemplate;
	
	public static final String COLLECTION="user";

	@Override
	public User userRegister(User user) {
			
	
		System.out.println("Now in service");
		
		if(!mongoTemplate.collectionExists(User.class)){
	    
			mongoTemplate.createCollection(User.class);
		}
		mongoTemplate.insert(user , COLLECTION);
		System.out.println("Successs");
		return user;
	}

	
}
