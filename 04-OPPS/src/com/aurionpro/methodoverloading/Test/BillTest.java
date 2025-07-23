package com.aurionpro.methodoverloading.Test;

import com.aurionpro.methodoverloading.model.Bill;

public class BillTest {
	public static void main(String[] args) {
		String item = "Book";
		int qty = 5;
		Double MRP = 235.98;
		double discount = 100;
		double tax = 45.98;
		
		Bill bills = new Bill();
		System.out.println("-----Bill for item :"+item+"-----");
		System.out.println("Total Price :"+bills.generateBill(item, qty, MRP));
		System.out.println("Price after discount :"+bills.generateBill(item, qty, MRP, discount));
		System.out.println("Final bill :"+bills.generateBill(item, qty, MRP, discount, tax));
	}
}
//Create a class Bill with:
// generateBill(String item, int qty)
// generateBill(String item, int qty, double discount)
// generateBill(String item, int qty, double discount, double tax)
//Print total bill amount accordingly.