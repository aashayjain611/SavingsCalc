package org.aashay.spit.SavingsCalc.ShortTermGoal;

public class ShortTerm {
	
	private String uid;
	private String month;
	private String purpose;
	private int amountRequired;
	private int period;
	private int estimatedSavings;
	private int amountSaved;
	private int savingsDeficit;
	
	public int getEstimatedSavings() {
		return estimatedSavings;
	}

	public void setEstimatedSavings(int estimatedSavings) {
		this.estimatedSavings = estimatedSavings;
	}

	public ShortTerm(String uid, String purpose, int amountRequired, int period) {
		super();
		this.uid=uid;
		this.purpose = purpose;
		this.amountRequired = amountRequired;
		this.period = period;
	}

	public ShortTerm(String month, String purpose, int amountRequired, int period, int amountSaved,
			int savingsDeficit,int estimatedSavings) {
		super();
		this.month = month;
		this.purpose = purpose;
		this.amountRequired = amountRequired;
		this.period = period;
		this.amountSaved = amountSaved;
		this.savingsDeficit = savingsDeficit;
		this.estimatedSavings=estimatedSavings;
	}

	public ShortTerm() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getAmountRequired() {
		return amountRequired;
	}

	public void setAmountRequired(int amountRequired) {
		this.amountRequired = amountRequired;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public int getAmountSaved() {
		return amountSaved;
	}

	public void setAmountSaved(int amountSaved) {
		this.amountSaved = amountSaved;
	}

	public int getSavingsDeficit() {
		return savingsDeficit;
	}

	public void setSavingsDeficit(int savingsDeficit) {
		this.savingsDeficit = savingsDeficit;
	}

}
