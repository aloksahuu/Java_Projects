package com.aurionpro.testt;

import java.util.Scanner;

public class TwoDimensionArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter row size");
		int rowsize = scanner.nextInt();
		System.out.println("Enter column size ");
		int columnsize = scanner.nextInt();
		System.out.println("-----------------------");
		int[][] matrix = new int[rowsize][columnsize];
		for(int i =0; i<rowsize;i++) {
			for(int j = 0;j<columnsize;j++) {
				matrix[i][j]=scanner.nextInt();
			}
		}
		System.out.println("YOU ENTERED:");
		for(int i =0; i<rowsize;i++) {
			for(int j = 0;j<columnsize;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
