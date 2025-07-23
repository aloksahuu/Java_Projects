package com.aurionpro.model;

import java.util.Scanner;

public class ReverseAstring {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str1 = scanner.nextLine();
		String reversed = "" ;
		for(int i =str1.length()-1;i>=0;i--) {
			reversed=reversed+str1.charAt(i);
		}
		System.out.println("Reversed string is :\n"+reversed);
		scanner.close();
	}
}
