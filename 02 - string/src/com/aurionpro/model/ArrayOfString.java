package com.aurionpro.model;

import java.util.Scanner;

public class ArrayOfString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of array :");
		int size = scanner.nextInt();
		scanner.nextLine();
		String []arr = new String[size];
		for(int i =0;i<size;i++) {
			System.out.println("Enter the "+(i+1)+" string: ");
			arr[i]= scanner.nextLine();
		}
		System.out.println("You entered : ");
		for(int i =0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		int combine = 0;
		for(String result: arr) {	
			combine=combine+result.length();
			
		}
		System.out.println("Combined length is :"+combine);
		scanner.close();
	}
}
