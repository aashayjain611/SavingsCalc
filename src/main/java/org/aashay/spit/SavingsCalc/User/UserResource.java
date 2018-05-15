package org.aashay.spit.SavingsCalc.User;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.aashay.spit.SavingsCalc.Expense.ExpenseResource;
import org.aashay.spit.SavingsCalc.Income.IncomeResource;
import org.aashay.spit.SavingsCalc.Investments.InvestmentsResource;
import org.aashay.spit.SavingsCalc.LongTermGoal.LongTermResource;
import org.aashay.spit.SavingsCalc.ShortTermGoal.ShortTermResource;

/*import Expense.ExpenseResource;
import Income.IncomeResource;
import Investment.InvestmentResource;
import Long_term_goal.LongTermResource;
import Short_term_goal.ShortTermResource;*/

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {
	
	private UserService userService=new UserService();
	
	@GET
	public User getUid(@QueryParam("name") String name,
						@QueryParam("password") String password)
	{
		return userService.getUid(name,password);
	}
	
	@GET
	@Path("/{uid}")
	public User getUserByUid(@PathParam("uid") String uid)
	{
		return userService.getUserByUid(uid);
	}
	
	@POST
	public int postUserToDatabase(User user)
	{
		return userService.postUserToDatabase(user);
	}
	
	@Path("/{uid}/income")
	public IncomeResource getIncome()
	{
		return new IncomeResource();
	}
	
	@Path("/{uid}/expense")
	public ExpenseResource getExpense()
	{
		return new ExpenseResource();
	}
	
	@Path("/{uid}/shortterm")
	public ShortTermResource getGoal()
	{
		return new ShortTermResource();
	}

	@Path("/{uid}/investments")
	public InvestmentsResource getInvestment()
	{
		return new InvestmentsResource();
	}
	
	@Path("/{uid}/longterm")
	public LongTermResource getLongTerm()
	{
		return new LongTermResource();
	}
}
