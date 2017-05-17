package com.PayAndRecovery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.PayAndRecovery.IService.IClaimService;
import com.PayAndRecovery.pojo.Claim;

@Controller
public class ClaimRegisterController {
	
	@Autowired
	IClaimService ClaimService;
	
	@RequestMapping(value="/claimRegister", method=RequestMethod.POST)
	public @ResponseBody String claimRegister(@RequestParam("recoverID") String recoverID, @RequestParam("policyNumber") String policyNumber ,@RequestParam("totalAmountPaid") String totalAmountPaid ,@RequestParam("dateOfAllotment") String dateOfAllotment ,@RequestParam("insuredName") String insuredName ,@RequestParam("claimNumber") String claimNumber ,@RequestParam("locationCode") String locationCode ,@RequestParam("insuredAddress") String insuredAddress ,@RequestParam("rateOfInterest") String  rateOfInterest, @RequestParam("interestAmount") String interestAmount ) {
		
		Claim clm=new Claim();
		
		clm.setRecoverID(recoverID); 
		clm.setPolicyNumber(policyNumber);
		clm.setClaimNumber(claimNumber);
		clm.setDateOfAllotment(dateOfAllotment);
        clm.setInsuredName(insuredName);
        clm.setRateOfInterest(rateOfInterest);
        clm.setInsuredAddress(insuredAddress);
        clm.setLocationCode(locationCode);
        clm.setTotalAmountPaid(totalAmountPaid);
        clm.setInterestAmount(interestAmount);
        
        ClaimService.claimRegster(clm);
		
		return "Claim Registered Successfully";
		
	}
	
	
	
	@RequestMapping(value="/claimSearch" ,method=RequestMethod.GET ,produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Claim> claimSearch(@RequestParam("recoverID") String recoverID,  @RequestParam("dateOfAllotment") String dateOfAllotment, @RequestParam("insuredName") String insuredName,@RequestParam("claimNumber") String claimNumber ,@RequestParam("locationCode") String locationCode){
	
		Claim clm=new Claim();
		
		
		clm.setRecoverID(recoverID);
		
		clm.setClaimNumber(claimNumber);
		clm.setInsuredName(insuredName);
		clm.setLocationCode(locationCode);
		clm.setDateOfAllotment(dateOfAllotment);
		
		
	    List<Claim> claim =ClaimService.claimSearch(clm);
	
     	return claim;
		
}
	

}
