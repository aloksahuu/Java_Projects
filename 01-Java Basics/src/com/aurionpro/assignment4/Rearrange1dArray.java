package com.aurionpro.assignment4;

import java.util.Scanner;

public class Rearrange1dArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter elements in the array");
		int size = scanner.nextInt();
		int[]arr = new int[size];
		for(int i =0;i<size;i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.print("You Entered: ");
		for(int i =0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		int[]result = new int[size];
		int left = 0;
		int right = size-1;
		for(int i =0;i<size;i++) {
			if(arr[i]%2==0) {
				result[left]=arr[i];
				left++;
			}else {
				result[right]=arr[i];
				right--;
			}
		}
		System.out.println(" Array after rearrangment :");
		for(int num : result) {
			System.out.print(num +" ");
		}
		
		scanner.close();
	}
	
}
