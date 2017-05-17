package com.PayAndRecovery.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.PayAndRecovery.IService.IUserLogin;
import com.PayAndRecovery.pojo.User;


@Service("UserLogin")
public class UserLogin implements IUserLogin {
	
	@Autowired
	MongoTemplate mongoTemplate;
	


	@Override
	public boolean userLogin(User user){

				
		Criteria criteria=new Criteria();
		
	    Query query=new Query(criteria.andOperator(Criteria.where("name").is(user.getName()),Criteria.where("password").is(user.getPassword())));
		
		List<User> li=mongoTemplate.find(query, User.class);
		
		System.out.println();
		if (li.size() > 0) {
			return true;
		} else {
			return false;
		}
		
	}

	


}
