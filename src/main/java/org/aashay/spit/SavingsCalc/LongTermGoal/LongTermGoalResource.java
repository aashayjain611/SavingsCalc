package org.aashay.spit.SavingsCalc.LongTermGoal;

import java.util.ArrayList;

import javax.ws.rs.GET;

public class LongTermGoalResource {
	
	private String uid;
	private LongTermGoalService longTerm=new LongTermGoalService();

	public LongTermGoalResource(String uid) {
		this.uid=uid;
	}
	
	@GET
	public ArrayList<LongTermGoal> getLongTermByUid()
	{
		return longTerm.getLongTermByUid(uid);
	}

}
