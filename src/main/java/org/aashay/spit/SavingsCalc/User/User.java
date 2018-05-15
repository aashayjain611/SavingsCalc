package org.aashay.spit.SavingsCalc.User;

public class User {
	
	private String name;
	private String uid;
	private String dob;
	private int age;
	private String gender;
	private String category;
	private String occupation;
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, String dob, int age, String gender, String category, String occupation) {
		super();
		this.name = name;
		this.dob = dob;
		this.age = age;
		this.gender = gender;
		this.category = category;
		this.occupation = occupation;
	}
	public User(String name, String dob, int age, String gender, String category, String occupation, String password) {
		super();
		this.name = name;
		this.dob = dob;
		this.age = age;
		this.gender = gender;
		this.category = category;
		this.occupation = occupation;
		this.password=password;
	}
	
	public User(String uid)
	{
		this.uid=uid;
	}
	
}
