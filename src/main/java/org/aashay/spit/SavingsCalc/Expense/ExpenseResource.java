package org.aashay.spit.SavingsCalc.Expense;

import java.util.ArrayList;

import javax.ws.rs.GET;

public class ExpenseResource {
	
	private String uid;
	private ExpenseService expenseService=new ExpenseService();

	public ExpenseResource(String uid) {
		this.uid=uid;
	}

	@GET
	public ArrayList<Expense> getExpenseByUid()
	{
		return expenseService.getExpenseByUid(uid);
	}
	
}
