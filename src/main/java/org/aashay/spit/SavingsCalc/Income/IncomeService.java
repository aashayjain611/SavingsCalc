package org.aashay.spit.SavingsCalc.Income;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.aashay.spit.SavingsCalcDatabase.MySql;

public class IncomeService {
	
	private MySql mysql=new MySql();

	public ArrayList<Income> getIncomeByUid(String uid) 
	{
		System.out.println(uid);
		ArrayList<Income> list=new ArrayList<>();
		try
		{
			Statement stmt=mysql.connectToDatabase();
			String query="select Month,Source,Income,Tax,In_Hand from Income where UserID='"+uid+"'";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
				list.add(new Income(rs.getString(1).toString(),rs.getString(2),rs.getInt(3),rs.getFloat(4),rs.getFloat(5)));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}

	public int postToDatabase(Income income) 
	{
		System.out.println("Source: "+income.getSource());
		System.out.println("Income is: "+income.getIncome());
		System.out.println("Tax is: "+income.getTax());
		//System.out.println(income);
		try
		{
			Statement stmt=mysql.connectToDatabase();
			if(checkUid(stmt,income.getUid()))
			{
				String query="insert into Income values('"+income.getUid()+"','"+income.getMonth()+"','"+income.getSource()+"',"+income.getIncome()+","+income.getTax()+","+(income.getIncome()*(1-income.getTax()/100))+")";
				System.out.println(query);
				return stmt.executeUpdate(query);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return -1;
	}
	public boolean checkUid(Statement stmt,String uid)
	{
		ArrayList<String> list=new ArrayList<>();
		try
		{
			String query="select UserID from User";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
				list.add(rs.getString(1));
			if(list.contains(uid))
				return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}

}
