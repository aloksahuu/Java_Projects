package com.aurionpro.model;

public interface PaymentGateway {
	boolean pay(double amaount);
	void refund(double amount);
}
