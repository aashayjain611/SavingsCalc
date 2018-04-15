package org.aashay.spit.SavingsCalc.Income;

public class Income {
	
	private String uid;
	private String source;
	private float tax;
	private int income;
	private float inHand;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public float getInHand() {
		return inHand;
	}
	public void setInHand(float inHand) {
		this.inHand = inHand;
	}
	public Income(String uid, String source, float tax, int income) {
		super();
		this.uid = uid;
		this.source = source;
		this.tax = tax;
		this.income = income;
	}
	public Income(String uid, String source, float tax, int income, float inHand) {
		super();
		this.uid = uid;
		this.source = source;
		this.tax = tax;
		this.income = income;
		this.inHand = inHand;
	}
	public Income() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
