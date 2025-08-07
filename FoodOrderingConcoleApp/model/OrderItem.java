package com.aurionpro.FoodOrderingConcoleApp.model;

public class OrderItem {
	private MenuItem item;
	private int quantity;

	public OrderItem(MenuItem item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}

	public double getTotal() {
		return item.getPrice() * quantity;
	}

	public String toString() {
		return item.getName() + " x " + quantity + " = ₹" + getTotal();
	}

	public MenuItem getItem() {
		return item;
	}
}
