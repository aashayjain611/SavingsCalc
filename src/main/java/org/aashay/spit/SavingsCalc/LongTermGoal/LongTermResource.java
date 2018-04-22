package org.aashay.spit.SavingsCalc.LongTermGoal;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.PathParam;

public class LongTermResource {
	
	private LongTermService longTerm=new LongTermService();
	
	@GET
	public ArrayList<LongTerm> getLongTermByUid(@PathParam("uid") String uid)
	{
		return longTerm.getLongTermByUid(uid);
	}

}
