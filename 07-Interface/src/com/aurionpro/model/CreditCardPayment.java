package com.aurionpro.model;

public class CreditCardPayment implements Payment{
	public void processPayment(double amount) {
		System.out.println("Processing Credit card payment of RS. "+amount);
	}

}
