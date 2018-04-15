package org.aashay.spit.SavingsCalc.User;

import java.io.InputStream;
import java.sql.Date;

public class User {
	
	private String name;
	private String uid;
	private Date dob;
	private int age;
	private String gender;
	private String category;
	private String occupation;
	private InputStream image;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
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
	public InputStream getImage() {
		return image;
	}
	public void setImage(InputStream image) {
		this.image = image;
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
	
	public User(String name,String uid, Date dob, int age, String gender, String category, String occupation, InputStream image) {
		super();
		this.name = name;
		this.uid=uid;
		this.dob = dob;
		this.age = age;
		this.gender = gender;
		this.category = category;
		this.occupation = occupation;
		this.image = image;
	}
	public User(String name, Date dob, int age, String gender, String category, String occupation, InputStream image) {
		super();
		this.name = name;
		this.dob = dob;
		this.age = age;
		this.gender = gender;
		this.category = category;
		this.occupation = occupation;
		this.image = image;
	}
	
}
