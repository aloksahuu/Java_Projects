package com.aurionpro.models;

public class Product {
	private int id;
	private String name;
	private double price;
	
	public Product() {
		// default
	}
	
	public int getId() {
		return id;
	}
	public String getNmae() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;			
	}
	public void setPrice(double price) {
		if(price>0) {
			this.price=price;
		}else {
			System.out.println("Enter valid price :");
			this.price =0;
		}
	}
	
	public void display() {
		System.out.println("Product Name :"+name);
		System.out.println("Product ID :"+id);
		System.out.println("Price :"+price);
	}
}
