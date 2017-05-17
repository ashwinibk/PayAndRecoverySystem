package com.PayAndRecovery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.PayAndRecovery.IService.IRateOfInterest;
import com.PayAndRecovery.pojo.RateOfInterest;

@Controller
public class ROIController {
	
	
	@Autowired
	IRateOfInterest ROIService;
	
	
	
	@RequestMapping(value="/ROICalc" , method=RequestMethod.POST )
	public @ResponseBody double ROICalc(@RequestParam("totalAmount") double totalAmount, @RequestParam("interestRate") double interestRate,@RequestParam("time") double time ) {
		
		RateOfInterest roi=new RateOfInterest();
		
		
		roi.setInterestRate(interestRate);
	
		roi.setTotalAmount(totalAmount);
		
		roi.setTime(time);
		
		roi.setCalculationValue(time, interestRate, totalAmount);
	
		ROIService.interestCalc(roi);
		
		double res=roi.getCalculationValue();
		return res;
		
			
		
		
	}

}
