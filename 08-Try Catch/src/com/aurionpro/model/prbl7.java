package com.aurionpro.model;

public class prbl7 {
	public static void processPayment() {
		try {
			String payment = null;
			System.out.println(payment.length());
		} catch (NullPointerException e) {
			throw new RuntimeException("Runtime exception due to null value");
		}
	}
	
	public static void main(String[] args) {
		try {
			processPayment();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
}
