package com.aurionpro.model;

import java.util.Scanner;

public class ReplaceAlphabet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str1 = scanner.nextLine();
		System.out.println("You Entered :"+str1);
		String result = str1.replace('e','i');
		
		System.out.println("Original String: " + str1);
		System.out.println("Modified String: " + result);
		
		scanner.close();
		
	}
}
