package org.aashay.spit.SavingsCalc.Expense;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.aashay.spit.SavingsCalcDatabase.MySql;

public class ExpenseService {

	private MySql mysql=new MySql();
	
	public ArrayList<Expense> getExpenseByUid(String uid) 
	{
		ArrayList<Expense> list=new ArrayList<>();
		try
		{
			Statement stmt=mysql.connectToDatabase();
			String query="select * from Expense where UserID='"+uid+"'";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
				list.add(new Expense(rs.getString(1),rs.getDate(2).toString(),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6)));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}

}
