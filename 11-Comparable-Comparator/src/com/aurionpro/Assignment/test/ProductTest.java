package com.aurionpro.Assignment.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.aurionpro.Products.model.Products;
import com.aurionpro.Products.model.SortByCategoryAndPrice;

public class ProductTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Products> productList = new ArrayList<>();

		System.out.println("=== Product Entry System ===");

		while (true) {
			String category = "";
			String name = "";
			double price = 0.0;

			// Category input with validation loop
			while (true) {
				System.out.print("Enter product category: ");
				category = scanner.nextLine().trim();
				if (!category.isEmpty() && category.matches("[a-zA-Z ]+")) {
					break;
				} else {
					System.out.println("Invalid category. Only letters and spaces allowed.");
				}
			}

			// Name input with validation loop
			while (true) {
				System.out.print("Enter product name: ");
				name = scanner.nextLine().trim();
				if (!name.isEmpty() && name.matches("[a-zA-Z0-9 ]+")) {
					break;
				} else {
					System.out.println("Invalid name. Only letters, numbers and spaces allowed.");
				}
			}

			// Price input with validation loop
			while (true) {
				System.out.print("Enter product price: ");
				try {
					price = Double.parseDouble(scanner.nextLine());
					if (price > 0) {
						break;
					} else {
						System.out.println("Price must be positive.");
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid price format. Please enter a valid number.");
				}
			}

			// Add product to list
			productList.add(new Products(category, name, price));

			// Ask if user wants to add another product
			String again;
			while (true) {
				System.out.print("Do you want to add another product? (yes/no): ");
				again = scanner.nextLine().trim().toLowerCase();
				if (again.equals("yes") || again.equals("no")) {
					break;
				} else {
					System.out.println("Please enter 'yes' or 'no'.");
				}
			}

			if (again.equals("no")) {
				break;
			}
		}

		// Sorting and displaying the products
		if (productList.isEmpty()) {
			System.out.println("No products to display.");
			return;
		}

		Collections.sort(productList, new SortByCategoryAndPrice());

		System.out.println("\n=== Sorted Products (by Category & Price) ===");
		for (Products p : productList) {
			System.out.println(p);
		}

		scanner.close();
	}
}
