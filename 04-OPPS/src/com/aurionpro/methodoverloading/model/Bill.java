package com.aurionpro.methodoverloading.model;

public class Bill {
	String item;
	int qty;
	double discount;
	double tax;
	double MRP;
	
	public double generateBill(String item, int qty,double MRP) {
		return qty*MRP;
	}
	public double generateBill(String item, int qty,double MRP,double discount) {
		return qty*MRP - discount;
	}
	
	public double  generateBill(String item, int qty, double MRP, double discount, double tax) {
		return qty*MRP- discount + tax;
	}
}
