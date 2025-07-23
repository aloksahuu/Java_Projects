package com.aurionpro.testt;

public class SwapValuesOfTwoIntegers {
	public static void main(String[]args) {
		// with third variable
		int a = 5;
		int b = 10;
		System.out.println("Before swapping a = "+a+",b = "+b);
		
//		int temp = a;
//		a = b;
//		b = temp;
//		System.out.println("After swapping a = "+a+",b = "+b);
		
		// without third variable
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping a = "+a+",b = "+b);
	}

}
