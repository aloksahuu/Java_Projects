package com.aurionpro.testt;

import java.util.Scanner;

public class CalculatorusingMethod {
	public static int addition(int a, int b) {
		int add = a+b;
		return add;
	}
	public static int subtraction(int a, int b) {
		int subtract = a-b;
		return subtract;
	}
	public static int multiply(int a, int b) {
		int multiplication = a*b;
		return multiplication;
	}
	public static int divison(int a, int b) {
		int divide;
		if(b==0){
			System.out.println("The number cant be divide");
		} 
			 divide = a/b;
			 return divide;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers :");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("Please enter what you want to perform?");
		System.out.println("1.add");
		System.out.println("2.Subtract");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
		int input = scanner.nextInt();
		switch(input) {
		case 1 : System.out.println("The addition of "+a+ "and "+b+" is:"+addition(a,b));
		break;
		
		case 2 : System.out.println("The Subtraction of "+a+ "and "+b+" is:"+subtraction(a,b));
		break;
		
		case 3 : System.out.println("The Multiplication of "+a+ "and "+b+" is:"+multiply(a,b));
		break;
		
		case 4 : System.out.println("The addition of "+a+ "and "+b+" is:"+divison(a,b));
		break;
		
		default : System.out.println("Plz entere number between 1 to 4");
		}
		
		scanner.close();
	}
}
