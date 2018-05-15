package org.aashay.spit.SavingsCalc.LongTermGoal;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.aashay.spit.SavingsCalcDatabase.MySql;

public class LongTermService {
	
	private MySql mysql=new MySql();

	public ArrayList<LongTerm> getLongTermByUid(String uid)
	{
		ArrayList<LongTerm> list=new ArrayList<>();
		try
		{
			float inHand=0;
			Statement stmt=mysql.connectToDatabase();
			String query="select UserID,Month,sum(In_hand) as In_hand from Income where UserID='"+uid+"'";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
			{
				inHand=rs.getFloat(3);
				//System.out.println(inHand);
				int expense=0;
				String month=rs.getString(2);
				String query1="select UserID,Month,sum(Amount) from Expense where UserID='"+uid+"' group by Month having Month='"+month+"'";
				Statement stmt1=mysql.connectToDatabase();
				ResultSet resultSet=stmt1.executeQuery(query1);
				if(resultSet.next())
					expense=resultSet.getInt(3);
				//System.out.println(month+"\t"+expense);
				if(inHand>expense)
				{
					Statement statement=mysql.connectToDatabase();
					String sql="";
					System.out.println("Inhand: "+inHand);
					System.out.println("Expense: "+expense);
					float saving=inHand-expense;
					float amount=0.13f*saving;
					System.out.println(amount);
					if(saving>amount)
					{
						sql="insert into Long_term_goal values('"+uid+"','"+month+"','Retirement',"+13+","+amount+","+amount+","+0+")";
						statement.executeUpdate(sql);
						list.add(new LongTerm(uid,month,"Retirement",13,amount,amount,0));
						saving=saving-amount;
					}
					else
					{
						sql="insert into Long_term_goal values('"+uid+"','"+month+"','Retirement',"+13+","+amount+","+saving+","+(amount-saving)+")";
						statement.executeUpdate(sql);
						list.add(new LongTerm(uid,month,"Retirement",13,amount,saving,amount-saving));
						saving=0;
					}
					amount=0.05f*(inHand-expense);
					if(saving>amount)
					{
						sql="insert into Long_term_goal values('"+uid+"','"+month+"','Medical',"+5+","+amount+","+amount+","+0+")";
						statement.executeUpdate(sql);
						list.add(new LongTerm(uid,month,"Medical",5,amount,amount,0));
						saving=saving-amount;
					}
					else
					{
						sql="insert into Long_term_goal values('"+uid+"','"+month+"','Medical',"+5+","+amount+","+saving+","+(amount-saving)+")";
						statement.executeUpdate(sql);
						list.add(new LongTerm(uid,month,"Medical",5,amount,saving,amount-saving));
						saving=0;
					}
					amount=0.02f*(inHand-expense);
					if(saving>amount)
					{
						sql="insert into Long_term_goal values('"+uid+"','"+month+"','Buffer',"+2+","+amount+","+amount+","+0+")";
						statement.executeUpdate(sql);
						list.add(new LongTerm(uid,month,"Buffer",2,amount,amount,0));
						saving=saving-amount;
					}
					else
					{
						sql="insert into Long_term_goal values('"+uid+"','"+month+"','Buffer',"+2+","+amount+","+saving+","+(amount-saving)+")";
						statement.executeUpdate(sql);
						list.add(new LongTerm(uid,month,"Buffer",2,amount,saving,amount-saving));
						saving=0;
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}

}
