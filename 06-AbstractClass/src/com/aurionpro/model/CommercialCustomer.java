package com.aurionpro.model;

public class CommercialCustomer extends Customer {
	public static final int charge = 8;
	
	public CommercialCustomer(String name, int unitsConsumed) {
		super(name, unitsConsumed);
	}
		
	@Override
	public void CalculateBill() {
		System.out.println(name + " your Commercial Bill is :"+charge*unitsConsumed);
	}
	
}
