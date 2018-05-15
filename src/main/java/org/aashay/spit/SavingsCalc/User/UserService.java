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
	
	public User getUserByUid(String uid)
	{
		User user=null;
		try
		{
			Statement stmt=mysql.connectToDatabase();
			String query="select Username,DOB,Age,Gender,Category,Occupation from User where UserID='"+uid+"'";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
				user=new User(rs.getString(1),rs.getDate(2).toString(),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return user;
	}

	public int postUserToDatabase(User user) 
	{
		System.out.println("Age: "+user.getAge());
		System.out.println("Category: "+user.getCategory());
		System.out.println("Date of birth: "+user.getDob());
		System.out.println("Gender: "+user.getGender());
		System.out.println("Username: "+user.getName());
		System.out.println("Occupation: "+user.getOccupation());
		System.out.println("Password: "+user.getPassword());
		try
		{
			user.setUid(generateUid(8));
			Statement stmt=mysql.connectToDatabase();
			String query="insert into User value('"+user.getName()+"','"+user.getUid()+"','"+user.getDob()+"',"+user.getAge()+",'"+user.getGender()+"','"+user.getCategory()+"','"+user.getOccupation()+"','"+user.getPassword()+"')";
			System.out.println(query);
			return stmt.executeUpdate(query);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return -1;
	}

	public User getUid(String name,String password) 
	{
		User user=null;
		System.out.println("Username: "+name);
		System.out.println("Password: "+password);
		try
		{
			Statement stmt=mysql.connectToDatabase();
			String query="select UserID from User where Username='"+name+"' and Password='"+password+"'";
			ResultSet rs=stmt.executeQuery(query);
			if(rs.next())
				user=new User(rs.getString(1));
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		System.out.println("UserID: "+user.getUid());
		return user;
	}
	
}
