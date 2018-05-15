package org.aashay.spit.SavingsCalc.Income;

public class Income {
	
	private String uid;
	private String month;
	private String source;
	private int income;
	private float tax;
	private float inHand;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public float getInHand() {
		return inHand;
	}
	public void setInHand(float inHand) {
		this.inHand = inHand;
	}
	
	public Income(String uid, String month, String source, int income, float tax) {
		super();
		this.uid = uid;
		this.month = month;
		this.source = source;
		this.income = income;
		this.tax = tax;
	}
	public Income(String month, String source, int income, float tax, float inHand) {
		super();
		this.month = month;
		this.source = source;
		this.income = income;
		this.tax = tax;
		this.inHand = inHand;
	}
	public Income() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
