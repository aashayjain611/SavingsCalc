package org.aashay.spit.SavingsCalc.Goal;

import java.util.ArrayList;

import javax.ws.rs.GET;

public class GoalResource {
	
	private String uid;
	private GoalService goalService=new GoalService();

	public GoalResource(String uid) {
		this.uid=uid;
	}
	
	@GET
	public ArrayList<Goal> getGoalByUid()
	{
		return goalService.getGoalByUid(uid);
	}

}
