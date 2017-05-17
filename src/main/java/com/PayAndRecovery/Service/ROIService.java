package com.PayAndRecovery.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.PayAndRecovery.IService.IRateOfInterest;
import com.PayAndRecovery.pojo.RateOfInterest;

@Service
public class ROIService implements IRateOfInterest {


	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@Override
	public RateOfInterest interestCalc(RateOfInterest roi) {
		
		
		if(!mongoTemplate.collectionExists(RateOfInterest.class)){
			
			mongoTemplate.createCollection(RateOfInterest.class);
		}
		mongoTemplate.insert(roi);
		
		return roi;
	
	}
	
			
}
		
	


