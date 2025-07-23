package com.aurionpro.testt;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int number = 153;
		int original = number;
		int result =0;
		while(original !=0) {
			int remender = original%10;
			result += Math.pow(remender,3);
			original = original/10;
		}
		if (result == number) {
			System.out.println(number +" is Armstrong number.");
		}else {
			System.out.println(number +" is not a Armstrong number.");
		}
	}

}
