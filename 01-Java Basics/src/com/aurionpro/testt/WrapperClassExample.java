package com.aurionpro.testt;

public class WrapperClassExample {
	public static void main(String[] args) {
		int number1 = 10;
		Integer number2 = new Integer(number1); // boxing
		Integer number3 = number1; //autoboxing
		
		System.out.println(number2);
		System.out.println(number3);
		
		int number4 = number2.intValue(); // unboxing
		int number5 = number2; // autounboxing
		System.out.println(number4);
		System.out.println(number5);
	}
}
