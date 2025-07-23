package com.aurionpro.model;

public class prbl6 {
	public static void main(String[] args) {
		
		try {
			int a = 10;
			int b = 0;
			int result = a/b;
			
			try {
				int[] arr = new int[3];
				System.out.println("Acessing 5th element :"+arr[5]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index out of bond");
			}
		}catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		
		System.out.println("Program continuess...");
	}
}
