package org.aashay.spit.SavingsCalc.Goal;

public class Goal {
	
	private String uid;
	private String purpose;
	private float poi;
	private float savingDeficit;
	private float amount;
	public Goal(String uid, String purpose, float poi, float savingDeficit, float amount) {
		super();
		this.uid = uid;
		this.purpose = purpose;
		this.poi = poi;
		this.savingDeficit = savingDeficit;
		this.amount = amount;
	}
	public Goal() {
		super();
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
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
	public float getSavingDeficit() {
		return savingDeficit;
	}
	public void setSavingDeficit(float savingDeficit) {
		this.savingDeficit = savingDeficit;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
}