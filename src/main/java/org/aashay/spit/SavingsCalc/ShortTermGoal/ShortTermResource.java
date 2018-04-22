package org.aashay.spit.SavingsCalc.ShortTermGoal;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;

public class ShortTermResource {
	
	private ShortTermService sts=new ShortTermService();

	@GET
	public ArrayList<ShortTerm> getShortTermByUid(@PathParam("uid") String uid)
	{
		return sts.getShortTermByUid(uid);
	}
	
	@POST
	public int postToDatabase(ShortTerm shortTerm)
	{
		return sts.postToDatabase(shortTerm);
	}
}
