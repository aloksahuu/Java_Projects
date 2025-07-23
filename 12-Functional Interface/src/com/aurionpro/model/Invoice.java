package com.aurionpro.model;

public class Invoice {
	public String itemName;
	public int quantity;
	public double price;

	public Invoice(String itemName, int quantity, double price) {
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}
}
