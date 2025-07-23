package com.aurionpro.model;

public class ResidentialCustomer extends Customer{
	public static final int charge = 5;
	
	public ResidentialCustomer(String name, int unitsConsumed) {
		super(name, unitsConsumed);
	}
	
	@Override
	public void CalculateBill() {
		System.out.println(name + " your Resedential Bill is :"+charge*unitsConsumed);
	}
	
}
