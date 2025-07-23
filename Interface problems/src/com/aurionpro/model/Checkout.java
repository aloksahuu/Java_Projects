package com.aurionpro.model;

public class Checkout {
	private PaymentGateway payment;
	
	public Checkout(PaymentGateway payment) {
		this.payment=payment;
	}
	
	public void processPayment(double amount) {
		payment.pay(amount);
	}
	
	public void processRefund(double amount) {
		payment.refund(amount);
	}
}
