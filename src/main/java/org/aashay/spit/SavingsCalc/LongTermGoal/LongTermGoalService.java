package org.aashay.spit.SavingsCalc.LongTermGoal;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.aashay.spit.SavingsCalcDatabase.MySql;

public class LongTermGoalService {
	
	private MySql mysql=new MySql();

	public ArrayList<LongTermGoal> getLongTermByUid(String uid) 
	{
		ArrayList<LongTermGoal> list=new ArrayList<>();
		try
		{
			Statement stmt=mysql.connectToDatabase();
			String query="select * from Long_term_goal where UserID='"+uid+"'";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
				list.add(new LongTermGoal(rs.getString(1),rs.getDate(2).toString(),rs.getFloat(3),rs.getFloat(4),rs.getFloat(5),rs.getFloat(6)));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}

}
