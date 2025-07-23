package com.array.assignments;

import java.util.Scanner;

public class SumOfElementInArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = scanner.nextInt();
		int []arr = new int[size];
		System.out.println("Enter elements in the array");
		for (int i = 0; i<size; i++) {
			arr[i]=scanner.nextInt();
		}
		int sum =0;
		for(int i =0; i<size;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum of elements in the array is: " + sum);

        scanner.close();
	}
}
