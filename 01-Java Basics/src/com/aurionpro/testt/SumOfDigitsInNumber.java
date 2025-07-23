package com.aurionpro.testt;

public class SumOfDigitsInNumber {
	public static void main(String[] args) {
		int num = 127;
		int sum = 0;
		int original = num;
		while(original > 0) {
			int temp = original%10;
			sum = sum + temp;
			original = original/10;
		}
		System.out.println("The sum of digits is: "+sum);
	}
}
	
