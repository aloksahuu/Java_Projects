package com.aurionpro.models;

public class ProductPriceCalculator {
	String productName;
	int price;
	int quantity;
	
	public ProductPriceCalculator(String productName, int price, int quantity) {
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
	}
	
	public int calculateTotal() {
		return price *quantity;
	}
	
	public void display() {
		System.out.println("Product name :"+productName);
		System.out.println("Product price :"+price);
		System.out.println("Quantity :"+quantity);
		System.out.println("Total price is :"+calculateTotal());
	}
}
