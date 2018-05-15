package org.aashay.spit.SavingsCalc.Expense;

public class Expense {
	
	private String uid;
	private String date;
	private String product;
	private int price;
	private int quantity;
	private int amount;
	
	public Expense(String uid, String date, String product, int quantity,int price) {
		super();
		this.uid = uid;
		this.date = date;
		this.product = product;
		this.price=price;
		this.quantity = quantity;
	}
	public Expense(String date, String product, int quantity,int price ,int amount) {
		super();
		this.date = date;
		this.product = product;
		this.price=price;
		this.quantity = quantity;
		this.amount = amount;
	}
	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
