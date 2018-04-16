package org.aashay.spit.SavingsCalc.Investments;

public class Investments {
	
	private String uid;
	private float mutualFunds;
	private float stocks;
	private float others;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public float getMutualFunds() {
		return mutualFunds;
	}
	public void setMutualFunds(float mutualFunds) {
		this.mutualFunds = mutualFunds;
	}
	public float getStocks() {
		return stocks;
	}
	public void setStocks(float stocks) {
		this.stocks = stocks;
	}
	public float getOthers() {
		return others;
	}
	public void setOthers(float others) {
		this.others = others;
	}
	public Investments(String uid, float mutualFunds, float stocks, float others) {
		super();
		this.uid = uid;
		this.mutualFunds = mutualFunds;
		this.stocks = stocks;
		this.others = others;
	}
	public Investments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
