package org.aashay.spit.SavingsCalc.Income;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class IncomeResource {
	
	private IncomeService incomeService=new IncomeService();
	
	public IncomeResource()
	{
		
	}
	
	@GET
	public ArrayList<Income> getIncomeByUid(@PathParam("uid") String uid)
	{
		return incomeService.getIncomeByUid(uid);
	}
	
	@POST
	public int postToDatabase(Income income)
	{
		return incomeService.postToDatabase(income);
	}

}
