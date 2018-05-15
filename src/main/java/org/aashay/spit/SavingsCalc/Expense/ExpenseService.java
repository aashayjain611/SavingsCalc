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
			String query="select Month,Product,Quantity,Price,Amount from Expense where UserID='"+uid+"'";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
				list.add(new Expense(rs.getString(1).toString(),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5)));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}
	public int postToDatabase(Expense expense)
	{
		System.out.println(expense.getProduct());
		System.out.println(expense.getPrice());
		System.out.println(expense.getQuantity());
		System.out.println(expense.getUid());
		System.out.println(expense.getDate());
		try
		{
			Statement stmt=mysql.connectToDatabase();
			if(checkUid(stmt,expense.getUid()))
			{
				String query="insert into Expense values('"+expense.getUid()+"','"+expense.getDate()+"','"+expense.getProduct()+"',"+expense.getQuantity()+","+expense.getPrice()+","+(expense.getPrice()*expense.getQuantity())+")";
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
