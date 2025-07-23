package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.models.ProductPriceCalculator;

public class ProductPriceCalculatorTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ProductPriceCalculator[] products = new ProductPriceCalculator[2];
		for(int i =0;i<2;i++) {
			System.out.println("Enter product name:");
			String name = scanner.nextLine();
			
			System.out.println("Enter price of product :");
			int price = scanner.nextInt();
			
			System.out.println("Enter quantity :");
			int quantity = scanner.nextInt();
			
			scanner.nextLine();
			products[i]= new ProductPriceCalculator(name, price, quantity);
		}
		for(ProductPriceCalculator result : products) {
			System.out.println("------Product Detail-------");
			result.display();
		}
		scanner.close();
	}
}
