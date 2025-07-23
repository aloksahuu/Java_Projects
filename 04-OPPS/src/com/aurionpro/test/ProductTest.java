package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.models.Product;

public class ProductTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Product products = new Product();
		
		System.out.println("Enter name of Product:");
		String name = scanner.nextLine();
		
		System.out.println("Enter product Id :");
		int id = scanner.nextInt();
		
		System.out.println("Enter price :");
		double price = scanner.nextDouble();
		
		products.setName(name);
		products.setId(id);
		products.setPrice(price);
		System.out.println("\n-----PRODUCT DETAILS -----");
		products.display();
		scanner.close();
	}
}
