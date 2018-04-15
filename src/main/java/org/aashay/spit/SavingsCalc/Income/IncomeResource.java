package org.aashay.spit.SavingsCalc.Income;

import java.util.ArrayList;

import javax.ws.rs.GET;

public class IncomeResource {

	private String uid;
	private IncomeService incomeService=new IncomeService();
	
	public IncomeResource(String uid) {
		this.uid=uid;
	}
	
	@GET
	public ArrayList<Income> getIncomeByUid()
	{
		return incomeService.getIncomeByUid(uid);
	}
	
}
