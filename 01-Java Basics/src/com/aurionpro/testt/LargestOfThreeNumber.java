package com.aurionpro.testt;

public class LargestOfThreeNumber {
	public static void main(String[] args) {
		int number1 = 2;
		int number2 = 4;
		int number3 = 8;
		if(number1 >= number2 && number1 >= number3) {
			System.out.println("Number 1 is largest "+number1);
		}
		else if(number2>=number1 && number2 >= number3) {
			System.out.println("Number 2 is largest "+number2);
		}else {
			System.out.println("Number 3 is largest "+number3);
		}
	}
}

