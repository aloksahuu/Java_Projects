package com.aurionpro.Assignment.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.aurionpro.Flight.model.Flight;
import com.aurionpro.Flight.model.SortByFare;

public class FlightTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Flight> list = new ArrayList<Flight>();

        System.out.println("---- Flight Info ----");
        while (true) {
            try {
                System.out.println("Enter airline name :");
                String name = scanner.nextLine();
                if (name.trim().isEmpty() || !name.matches("[a-zA-Z ]+")) {
                    throw new IllegalArgumentException("Enter a valid airline name!");
                }

                System.out.println("Enter airline fare :");
                double fare = Double.parseDouble(scanner.nextLine());

                if (fare <= 0) {
                    throw new IllegalArgumentException("Fare must be greater than 0.");
                }

                // Add flight to list
                list.add(new Flight(name, fare));

                // Ask whether to continue or not (only ONCE)
                String again;
                while (true) {
                    System.out.print("Add another Flight detail? (yes/no): ");
                    again = scanner.nextLine().trim().toLowerCase();
                    if (again.equals("yes") || again.equals("no")) break;
                    else System.out.println(" Invalid input. Please enter 'yes' or 'no'.");
                }

                if (again.equals("no")) break;

            } catch (NumberFormatException e) {
                System.out.println(" Invalid input. Please enter valid fare (numbers only).");
            } catch (IllegalArgumentException e) {
                System.out.println(" " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }

        if (list.isEmpty()) {
            System.out.println("No Flights to sort.");
            return;
        }

        try {
            System.out.println("\n Sorting flights by Fare (highest fare first)...");
            Collections.sort(list, new SortByFare());

            System.out.println("Sorted Flights:");
            for (Flight f : list) {
                System.out.println(f);
            }

        } catch (Exception e) {
            System.out.println("Unexpected error during sorting: " + e.getMessage());
        }

        scanner.close();
    }
}
