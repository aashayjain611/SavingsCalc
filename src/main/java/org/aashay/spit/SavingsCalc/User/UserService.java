package org.aashay.spit.SavingsCalc.User;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

import org.aashay.spit.SavingsCalcDatabase.MySql;

public class UserService {
	
	private MySql mysql=new MySql();

	public String generateUid(int n)
	{
		String str="1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		String uid="";
		Random r=new Random();
		for(int i=0;i<n;i++)
			uid+=str.charAt(r.nextInt(62));
		while(hasUid(uid))
			uid=generateUid(8);
		return uid;
	}
	
	public boolean hasUid(String uid) {
		ArrayList<String> list=new ArrayList<>();
		try
		{
			Statement stmt=mysql.connectToDatabase();
			String query="select UserID from User";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
				list.add(rs.getString(1));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		if(!list.isEmpty() && list.contains(uid))
			return true;
		return false;
	}
	
	public ArrayList<User> getUserByUid(String uid)
	{
		ArrayList<User> list=new ArrayList<>();
		try
		{
			Statement stmt=mysql.connectToDatabase();
			String query="select * from User where UserID='"+uid+"'";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
				list.add(new User(rs.getString(1),rs.getString(2),rs.getDate(3).toString(),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7)));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}

	public int postUserToDatabase(User user) 
	{
		try
		{
			user.setUid(generateUid(8));
			Statement stmt=mysql.connectToDatabase();
			String query="insert into User value('"+user.getName()+"','"+user.getUid()+"','"+user.getDob()+"',"+user.getAge()+",'"+user.getGender()+"','"+user.getCategory()+"','"+user.getOccupation()+"')";
			return stmt.executeUpdate(query);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return -1;
	}
	
}
