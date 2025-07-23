package com.aurionpro.testt;

public class PalindromeOrNot {
	public static void main(String[] args) {
		int number = 121;
		int original =number;
		int reverse =0;
		 while(number>0) {
			 int temp = number %10;
			 reverse = reverse*10 + temp;
			 number = number /10;
		}
		 if (original==reverse) {
			 System.out.println("The number is plaindrome number");
		 }else {
			 System.out.println("The number is not a plaindrome number");
		 }
	}

}
