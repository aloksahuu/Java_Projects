package com.aurionpro.testt;

import java.util.Scanner;

public class SwitchCaseExample {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the month number (1-12):");
		int month = scanner.nextInt();
		switch(month) {
		case 1 : System.out.println("The month is january and the no. of days is 31");
			break;
		case 2 : System.out.println("The month is February and the no. of days is 28");
			break;
		case 3 : System.out.println("The month is March and the no. of days is 31");
			break;
		case 4 : System.out.println("The month is April and the no. of days is 30");
			break;
		case 5 : System.out.println("The month is May and the no. of days is 31");
			break;
		case 6 : System.out.println("The month is june and the no. of days is 30");
			break;
		case 7 : System.out.println("The month is july and the no. of days is 31");
			break;
		case 8 : System.out.println("The month is August and the no. of days is 31");
			break;
		case 9 : System.out.println("The month is September and the no. of days is 30");
			break;
		case 10 : System.out.println("The month is October and the no. of days is 31");
			break;
		case 11 : System.out.println("The month is November and the no. of days is 30");
			break;
		case 12 : System.out.println("The month is December3 and the no. of days is 31");
			break;
		default : System.out.println("plz enter valid number");
			
		}
		scanner.close();
	}
}
