package org.aashay.spit.SavingsCalc.Expense;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ExpenseResource {

	private ExpenseService expenseService=new ExpenseService();
	
	@GET
	public ArrayList<Expense> getExpenseByUid(@PathParam("uid") String uid)
	{
		return expenseService.getExpenseByUid(uid);
	}
	
	@POST
	public int postToDatabase(Expense expense)
	{
		return expenseService.postToDatabase(expense);
	}
}
