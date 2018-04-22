package org.aashay.spit.SavingsCalc.LongTermGoal;

public class LongTerm {
	
	private String uid;
	private String month;
	private String purpose;
	private float poi;
	private float amount;
	private float amountSaved;
	private float savingsDeficit;
	
	public LongTerm() {
		super();
	}
	public LongTerm(String uid, String month, String purpose, float poi, float amount, float amountSaved,
			float savingsDeficit) {
		super();
		this.uid = uid;
		this.month = month;
		this.purpose = purpose;
		this.poi = poi;
		this.amount = amount;
		this.amountSaved = amountSaved;
		this.savingsDeficit = savingsDeficit;
	}

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

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public float getPoi() {
		return poi;
	}

	public void setPoi(float poi) {
		this.poi = poi;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public float getAmountSaved() {
		return amountSaved;
	}

	public void setAmountSaved(float amountSaved) {
		this.amountSaved = amountSaved;
	}

	public float getSavingsDeficit() {
		return savingsDeficit;
	}

	public void setSavingsDeficit(float savingsDeficit) {
		this.savingsDeficit = savingsDeficit;
	}
	
	
	
}
