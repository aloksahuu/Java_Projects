package com.aurionpro.testt;

public class ReverseNumber {
	public static void main (String[] args) {
		int number = 127;
		int reverse = 0;
		int original = number;
		while(original>0) {
			int digit = original%10;
			reverse = reverse*10 + digit;
			original = original/10;
		}
		System.out.println("The original number was: "+number+", the revresed number is :"+reverse);
	}

}
