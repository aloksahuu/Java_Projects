package com.aurionpro.testt;

public class PrimeOrNot {
	public static void main(String[]args) {
		int number = 5;
		boolean isPrime= true;
		if (number < 1) {
			isPrime = false;
		}else {
			for(int i = 2;i<= number; i++) {
				if(number%i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		
		if (isPrime = true) {
			System.out.println("The number is prime");
		}else {
			System.out.println("The number is not prime");
		}
	}

}
