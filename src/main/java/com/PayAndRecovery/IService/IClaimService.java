package com.PayAndRecovery.IService;

import java.util.List;

import com.PayAndRecovery.pojo.Claim;

public interface IClaimService {
	
	public void claimRegster(Claim claim);
	
	public List<Claim> claimSearch(Claim claim);

}
