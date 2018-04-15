package org.aashay.spit.SavingsCalc.Investments;

import java.util.ArrayList;

import javax.ws.rs.GET;

public class InvestmentsResource {
	
	private String uid;
	private InvestmentsService investmentsService=new InvestmentsService();

	public InvestmentsResource(String uid) {
		this.uid=uid;
	}
	
	@GET
	public ArrayList<Investments> getInvestmentByUid()
	{
		return investmentsService.getInvestmentsByUid(uid);
	}

}
