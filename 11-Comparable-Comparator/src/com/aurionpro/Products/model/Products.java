package com.aurionpro.Products.model;

public class Products {
	String category;
	String name;
	double price;
	
	public Products(String category, String name, double price) {
		this.category=category;
		this.name=name;
		this.price=price;
	}
	
	public String getCategory() {
		return category;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Products [category=" + category + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
