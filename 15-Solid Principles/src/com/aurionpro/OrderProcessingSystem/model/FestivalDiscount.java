package com.aurionpro.OrderProcessingSystem.model;

public class FestivalDiscount implements DiscountStrategy {

	@Override
	public double applyDiscount(double amount) {
		//10% off
		return amount*0.90;
	}

}
