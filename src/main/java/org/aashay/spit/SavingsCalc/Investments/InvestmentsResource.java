package org.aashay.spit.SavingsCalc.Investments;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.PathParam;

public class InvestmentsResource {
	
	private InvestmentsService investmentsService=new InvestmentsService();

	@GET
	public ArrayList<Investments> getInvestmentByUid(@PathParam("uid") String uid)
	{
		return investmentsService.getInvestmentsByUid(uid);
	}

}
