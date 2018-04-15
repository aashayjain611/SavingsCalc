package org.aashay.spit.SavingsCalc.Expense;

import java.sql.Date;

public class Expense {

	private String uid;
	private Date date;
	private int quantity;
	private String product;
	private int price;
	private int amount;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public Expense(String uid,Date date, int quantity, String product, int price) {
		super();
		this.uid=uid;
		this.date = date;
		this.quantity = quantity;
		this.product = product;
		this.price = price;
	}
	public Expense(String uid,Date date, int quantity, String product, int price, int amount) {
		super();
		this.uid=uid;
		this.date = date;
		this.quantity = quantity;
		this.product = product;
		this.price = price;
		this.amount = amount;
	}
	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
