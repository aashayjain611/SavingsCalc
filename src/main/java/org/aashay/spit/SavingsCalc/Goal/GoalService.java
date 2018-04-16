package org.aashay.spit.SavingsCalc.Goal;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.aashay.spit.SavingsCalcDatabase.MySql;

public class GoalService {
	
	private MySql mysql=new MySql();

	public ArrayList<Goal> getGoalByUid(String uid) 
	{
		ArrayList<Goal> list=new ArrayList<>();
		try
		{
			Statement stmt=mysql.connectToDatabase();
			String query="select * from Goal where UserID='"+uid+"'";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
				list.add(new Goal(rs.getString(1),rs.getString(2),rs.getFloat(3),rs.getFloat(4),rs.getFloat(5)));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}

}