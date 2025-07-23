package com.aurionpro.model;

public class Calculator {
	public int addition(int num1, int num2 ) {
		return num1+num2;
	}
	
	public double subtraction(double num1, double num2) {
		return num1-num2;
	}
	
	public int divison(int num1, int num2) {
		if(num2==0) throw new ArithmeticException("Cannot divide by zero");
		return num1/num2;
	}
}
