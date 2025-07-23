package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Bike;
import com.aurionpro.model.Car;
import com.aurionpro.model.Truck;
import com.aurionpro.model.VehicleControl;

public class VehicleTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		VehicleControl vehicle = null;

		while (true) {
			System.out.println("\n----Vehicle Control Menu----");
			System.out.println("1.Car");
			System.out.println("2.Bike");
			System.out.println("3. Truck");
			System.out.println("4. Exit");
			System.out.println("Choose a vehicle (1-4):");
			int choice;
			try {
				choice = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Plaese enter a valid number .");
				continue;
			}

			switch (choice) {
			case 1:
				vehicle = new Car();
				break;
			case 2:
				vehicle = new Bike();
				break;
			case 3:
				vehicle = new Truck();
				break;
			case 4:
				System.out.println(" Exiting program. Goodbye!");
				scanner.close();
				return;
			default:
				System.out.println(" Invalid choice. Please enter 1-4.");
				continue;
			}

			vehicle.start();
			int gear = -1;

			while (true) {
				try {
					System.out.print("Enter gear number: ");
					gear = Integer.parseInt(scanner.nextLine());
					break; // break loop if valid
				} catch (NumberFormatException e) {
					System.out.println(" Invalid input. Please enter a number.");
				}
			}

			vehicle.changeGear(gear);
			vehicle.stop();

			System.out.print("Do you want to continue? (yes/no): ");
			String again = scanner.nextLine().trim().toLowerCase();
			if (!again.equals("yes")) {
				System.out.println(" Program ended by user.");
				break;
			}
		}
		scanner.close();
	}
}
