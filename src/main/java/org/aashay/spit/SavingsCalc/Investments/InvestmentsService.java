package org.aashay.spit.SavingsCalc.Investments;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.aashay.spit.SavingsCalcDatabase.MySql;

public class InvestmentsService {
	
	private MySql mysql=new MySql();

	public ArrayList<Investments> getInvestmentsByUid(String uid)
	{
		ArrayList<Investments> list=new ArrayList<>();
		try
		{
			Statement stmt=mysql.connectToDatabase();
			String query="select * from Investments where UserID='"+uid+"'";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
				list.add(new Investments(rs.getString(1),rs.getFloat(2),rs.getFloat(3),rs.getFloat(4)));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}

}
