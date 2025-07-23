package week1assignments.test;

import java.util.Scanner;

import week1assignments.model.Product;


public class ProductTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        Product[] products = new Product[count];

        // Input products
        for (int i = 0; i < count; i++) {
            System.out.print("Enter product name: ");
            String name = scanner.nextLine();
            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            products[i] = new Product(name, price);
        }

        // Print products with price < 1000
        System.out.println("\nProducts with price less than ₹1000:");
        for (Product p : products) {
            if (p.price < 1000) {
                System.out.println(p.name);
            }
        }

        scanner.close();
    }
}

