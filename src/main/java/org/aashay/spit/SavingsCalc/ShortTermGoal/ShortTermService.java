package org.aashay.spit.SavingsCalc.ShortTermGoal;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

import org.aashay.spit.SavingsCalcDatabase.MySql;

public class ShortTermService {

	private MySql mysql=new MySql();
	
	public ArrayList<ShortTerm> getShortTermByUid(String uid) 
	{
		ArrayList<ShortTerm> list=new ArrayList<>();
		try
		{
			Statement stmt=mysql.connectToDatabase();
			Calendar cal=Calendar.getInstance();
			String mnths[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
			String month=mnths[cal.get(Calendar.MONTH)]+", "+cal.get(Calendar.YEAR);
			String query="select * from Short_term_goal where UserID='"+uid+"' and Month='"+month+"'";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
				list.add(new ShortTerm(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7)));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}
	public int postToDatabase(ShortTerm shortTerm)
	{
		Calendar cal=Calendar.getInstance();
		String mnths[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		String month=mnths[cal.get(Calendar.MONTH)]+", "+cal.get(Calendar.YEAR);
		int amountSaved=0;
		int savingsDeficit=0;
		try
		{
			Statement stmt=mysql.connectToDatabase();
			String query="select UserID,date_format(Month,'%M, %Y') as Month,sum(In_hand) as In_hand from Income where UserID='"+shortTerm.getUid()+"' and Month='"+month+"'";
			ResultSet rs=stmt.executeQuery(query);
			if(rs.next())
			{
				float inHand=rs.getFloat(3);
				int expense=0;
				String query1="select UserID,date_format(Month,'%M, %Y') as Month,sum(Amount) from Expense where UserID='"+shortTerm.getUid()+"' group by date_format(Month,'%M, %Y') having Month='"+month+"'"; 
				ResultSet result=stmt.executeQuery(query1);
				if(result.next())
					expense=result.getInt(3);
				System.out.println(expense);
				float savings=inHand-expense;
				float longTerm=0;
				float term=0;
				String query2="select sum(Amount_saved) from Long_term_goal where Month='"+month+"' and UserID='"+shortTerm.getUid()+"'";
				ResultSet resultSet=stmt.executeQuery(query2);
				if(resultSet.next())
					longTerm=resultSet.getFloat(1);
				if(savings>longTerm)
					savings-=longTerm;
				String query3="select UserID,Month,sum(Amount_saved) from Short_term_goal where UserID='"+shortTerm.getUid()+"' and Month='"+month+"";
				ResultSet set=stmt.executeQuery(query3);
				if(set.next())
					term=set.getFloat(3);
				if(savings>term)
					savings-=term;
				if(savings>(shortTerm.getAmountRequired()/shortTerm.getPeriod()))
				{
					amountSaved=shortTerm.getAmountRequired()/shortTerm.getPeriod();
					savings-=shortTerm.getAmountRequired()/shortTerm.getPeriod();
				}
				else
					savingsDeficit=(int)(shortTerm.getAmountRequired()/shortTerm.getPeriod()-savings);
				String sql="insert into Short_term_goal values('"+shortTerm.getUid()+"','"+month+"','"+shortTerm.getPurpose()+"',"+shortTerm.getAmountRequired()+","+amountSaved+","+savingsDeficit+")";
				return stmt.executeUpdate(sql);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return -1;
	}

}
