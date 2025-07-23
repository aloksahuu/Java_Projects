package com.aurionpro.model;

public abstract class Customer {
	String name;
	int unitsConsumed;
	
	public Customer(String name, int unitsConsumed) {
		this.name=name;
		this.unitsConsumed=unitsConsumed;
	}
	
	public abstract void CalculateBill();
}
