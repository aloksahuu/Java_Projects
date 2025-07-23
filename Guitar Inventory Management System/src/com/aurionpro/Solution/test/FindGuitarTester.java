package com.aurionpro.Solution.test;

import java.util.List;
import java.util.Scanner;

import com.aurionpro.Solution.model.Inventory;

public class FindGuitarTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();
        GuitarUIDesign.initializeInventory(inventory);

        boolean exit = false;
        System.out.println("\nWelcome to Rick's Guitar Inventory System");

        while (!exit) {
            System.out.println("\n===== Main Menu =====");
            System.out.println("1. Display All Guitars");
            System.out.println("2. Search Guitars ");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    GuitarUIDesign.displayGuitars(inventory.getAllGuitars());
                    break;
                case "2":
                    List<com.aurionpro.Solution.model.Guitar> matches = GuitarUIDesign.promptSearchFilters(scanner, inventory);
                    GuitarUIDesign.displayGuitars(matches);
                    break;
                case "3":
                    exit = true;
                    System.out.println("\nThank you for using Rick's Guitar Finder!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
