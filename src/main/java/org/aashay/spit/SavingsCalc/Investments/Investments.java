package org.aashay.spit.SavingsCalc.Investments;

public class Investments {
	
	private String uid;
	private int mutualFunds;
	private int stocks;
	private int others;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getMutualFunds() {
		return mutualFunds;
	}
	public void setMutualFunds(int mutualFunds) {
		this.mutualFunds = mutualFunds;
	}
	public int getStocks() {
		return stocks;
	}
	public void setStocks(int stocks) {
		this.stocks = stocks;
	}
	public int getOthers() {
		return others;
	}
	public void setOthers(int others) {
		this.others = others;
	}
	public Investments(String uid, int mutualFunds, int stocks, int others) {
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
