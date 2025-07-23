package com.array.assignments;

import java.util.Scanner;

public class PeakElementInArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = scanner.nextInt();
		int []arr = new int[size];
		System.out.println("Enter elements in the array");
		for (int i = 0; i<size; i++) {
			arr[i]=scanner.nextInt();
		}
		
		//peak element means compare both neighbours of array
		System.out.println("Peak elements are:");
        for (int i = 1; i < size - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }

        scanner.close();
	}
}
