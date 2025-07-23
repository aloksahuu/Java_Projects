package com.aurionpro.methodoverloading.Test;

import com.aurionpro.methodoverloading.model.SafeCalculator;

public class SafeCalculatorTest {
	public static void main(String[] args) {
		int a= 10;
		int b=2;
		
		double num1= 10.0;
		double num2 = 5.0;
		
		SafeCalculator calculator = new SafeCalculator();
		System.out.println(calculator.divide(a, b));
		System.out.println(calculator.divide(num1, num2));
	}
}
