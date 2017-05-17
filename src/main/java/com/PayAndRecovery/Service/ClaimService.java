package com.PayAndRecovery.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.PayAndRecovery.IService.IClaimService;
import com.PayAndRecovery.pojo.Claim;


@Service("ClaimService")
public class ClaimService implements IClaimService{
	
	public static final String COLLECTION="claim";

	@Autowired
	MongoTemplate mongoTemplate;
	
	@Override
	public void claimRegster(Claim claim){
		
	if(!mongoTemplate.collectionExists(Claim.class)){
				
		mongoTemplate.createCollection(Claim.class);
		
	}
	mongoTemplate.insert(claim, COLLECTION);
		
	}

	
	@Override
	public List<Claim> claimSearch(Claim claim) {
		
		Query query=null;
		Criteria criteria=new Criteria();
		
		
		query=new Query(criteria.orOperator(Criteria.where("recoverID").is(claim.getRecoverID()),Criteria.where("claimNumber").is(claim.getClaimNumber()),Criteria.where("locationCode").is(claim.getLocationCode()),Criteria.where("insuredName").is(claim.getInsuredName()),Criteria.where("dateOfAllotment").is(claim.getDateOfAllotment())));
		
		List<Claim> li=mongoTemplate.find(query, Claim.class, "claim");
		
		
		return li;
	}
	
	
}
