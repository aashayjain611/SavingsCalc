package org.aashay.spit.SavingsCalc.LongTermGoal;

public class LongTermGoal {
	
	private String uid;
	private String monthYear;
	private int amount;
	private float retirement;
	private float investment;
	private float buffer;
	
	public LongTermGoal(String uid, String monthYear) {
		super();
		this.uid = uid;
		this.monthYear = monthYear;
	}
	public LongTermGoal(String uid, String monthYear, int amount, float retirement, float investment, float buffer) {
		super();
		this.uid = uid;
		this.monthYear = monthYear;
		this.amount = amount;
		this.retirement = retirement;
		this.investment = investment;
		this.buffer = buffer;
	}
	public LongTermGoal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getMonthYear() {
		return monthYear;
	}
	public void setMonthYear(String monthYear) {
		this.monthYear = monthYear;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public float getRetirement() {
		return retirement;
	}
	public void setRetirement(float retirement) {
		this.retirement = retirement;
	}
	public float getInvestment() {
		return investment;
	}
	public void setInvestment(float investment) {
		this.investment = investment;
	}
	public float getBuffer() {
		return buffer;
	}
	public void setBuffer(float buffer) {
		this.buffer = buffer;
	}
	
}
