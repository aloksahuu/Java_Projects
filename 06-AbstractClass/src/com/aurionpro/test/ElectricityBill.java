package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.CommercialCustomer;
import com.aurionpro.model.Customer;
import com.aurionpro.model.ResidentialCustomer;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer[] customers = new Customer[3]; // Fixed-size array

        for (int i = 0; i < customers.length; i++) {
            System.out.println("\nCustomer " + (i + 1));

            System.out.print("Enter name: ");
            String name = scanner.next();

            System.out.println("Select customer type:");
            System.out.println("1. Residential");
            System.out.println("2. Commercial");
            int type = scanner.nextInt();

            System.out.print("Enter units consumed: ");
            int units = scanner.nextInt();

            if (type == 1) {
                customers[i] = new ResidentialCustomer(name, units);
            } else if (type == 2) {
                customers[i] = new CommercialCustomer(name, units);
            } else {
                System.out.println("Invalid type! Defaulting to Residential.");
                customers[i] = new ResidentialCustomer(name, units);
            }
        }

        // Print bills
        System.out.println("\n--- Customer Bills ---");
        for (Customer customer : customers) {
            customer.CalculateBill();
        }

        scanner.close();
    }
}
