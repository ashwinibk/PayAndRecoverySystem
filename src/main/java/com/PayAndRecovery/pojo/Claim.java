package com.PayAndRecovery.pojo;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection=("claim"))
public class Claim {
	
	private String recoverID, policyNumber, totalAmountPaid, dateOfAllotment, insuredName, claimNumber, locationCode, insuredAddress,rateOfInterest,interestAmount;
		
	public String getRecoverID() {
		return recoverID;
	}

	
	public void setRecoverID(String recoverID) {
		this.recoverID = recoverID;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	
	public String getTotalAmountPaid() {
		return totalAmountPaid;
	}

	
	public void setTotalAmountPaid(String totalAmountPaid) {
		this.totalAmountPaid = totalAmountPaid;
	}

	
	public String getDateOfAllotment() {
		return dateOfAllotment;
	}

	
	public void setDateOfAllotment(String dateOfAllotment) {
		this.dateOfAllotment = dateOfAllotment;
	}

	
	public String getInsuredName() {
		return insuredName;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	
	public String getClaimNumber() {
		return claimNumber;
	}

	public void setClaimNumber(String claimNumber) {
		this.claimNumber = claimNumber;
	}

	public String getLocationCode() {
		return locationCode;
	}


	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	
	public String getInsuredAddress() {
		return insuredAddress;
	}

	public void setInsuredAddress(String insuredAddress) {
		this.insuredAddress = insuredAddress;
	}

	public String getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(String rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	
	public String getInterestAmount() {
		return interestAmount;
	}

	
	public void setInterestAmount(String interestAmount) {
		this.interestAmount = interestAmount;
	}

	@Override
	public String toString() {
		return "User [id=" + recoverID + ", name=" + insuredName +
				",  ClaimNumber=" + claimNumber +
				",DateOfAllotment=" + dateOfAllotment +
				", LocationCode=" + locationCode + "]";
		
	}

}
