package com.aurionpro.OrderProcessingSystem.model;

public interface DiscountStrategy {
	public double applyDiscount(double amount);
}
