package com.aurionpro.Ecommerce.model;

public interface PaymentGateway {
	boolean pay(double amaount);
	void refund(double amount);
}
