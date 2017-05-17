package com.PayAndRecovery.pojo;

public class RateOfInterest {
	
	private double totalAmount, interestRate, time, result;
	

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	
	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	
	public double getResult() {
		return result;
	}

	
	public void setResult(double result) {
		this.result = result;
	}

	

	
	
//Calculation method
	
	private double calculationValue;

	public double getCalculationValue() {
		return calculationValue;
	}

	public void setCalculationValue(double interestRate, double totalAmount , double time) {
		
		calculationValue =totalAmount*(interestRate/100)*(time/365);
	}
	
}
