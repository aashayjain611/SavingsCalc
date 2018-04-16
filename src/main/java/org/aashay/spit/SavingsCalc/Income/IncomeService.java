package org.aashay.spit.SavingsCalc.Income;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.aashay.spit.SavingsCalcDatabase.MySql;

public class IncomeService {
	
	private MySql mysql=new MySql();

	public ArrayList<Income> getIncomeByUid(String uid) 
	{	
		ArrayList<Income> list=new ArrayList<>();
		try
		{
			Statement stmt=mysql.connectToDatabase();
			String query="select * from Income where UserID='"+uid+"'";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
				list.add(new Income(rs.getString(1),rs.getString(2),rs.getFloat(3),rs.getInt(4),rs.getFloat(5)));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}

}
