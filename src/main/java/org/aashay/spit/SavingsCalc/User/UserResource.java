package org.aashay.spit.SavingsCalc.User;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.aashay.spit.SavingsCalc.Expense.ExpenseResource;
import org.aashay.spit.SavingsCalc.Goal.GoalResource;
import org.aashay.spit.SavingsCalc.Income.IncomeResource;
import org.aashay.spit.SavingsCalc.Investments.InvestmentsResource;
import org.aashay.spit.SavingsCalc.LongTermGoal.LongTermGoalResource;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {
	
	UserService userService=new UserService();
	
	@GET
	@Path("/{uid}")
	public ArrayList<User> getUserByUid(@PathParam("uid") String uid)
	{
		return userService.getUserByUid(uid);
	}
	
	@POST
	public int postUserToDatabase(User user)
	{
		return userService.postUserToDatabase(user);
	}
	
	@Path("/{uid}/income")
	public IncomeResource getIncome(@PathParam("uid") String uid)
	{
		return new IncomeResource(uid);
	}
	
	@Path("/{uid}/expense")
	public ExpenseResource getExpense(@PathParam("uid") String uid)
	{
		return new ExpenseResource(uid);
	}
	
	@Path("/{uid}/goal")
	public GoalResource getGoal(@PathParam("uid") String uid)
	{
		return new GoalResource(uid);
	}

	@Path("/{uid}/investments")
	public InvestmentsResource getInvestment(@PathParam("uid") String uid)
	{
		return new InvestmentsResource(uid);
	}
	
	@Path("/{uid}/longterm")
	public LongTermGoalResource getLongTerm(@PathParam("uid") String uid)
	{
		return new LongTermGoalResource(uid);
	}
}
