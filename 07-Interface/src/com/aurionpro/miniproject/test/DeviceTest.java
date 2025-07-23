package com.aurionpro.miniproject.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.aurionpro.miniproject.model.Fan;
import com.aurionpro.miniproject.model.IControllable;
import com.aurionpro.miniproject.model.Light;
import com.aurionpro.miniproject.model.Speaker;
import com.aurionpro.miniproject.model.TV;

public class DeviceTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IControllable device = null;
        int choice = 0;

        do {
            try {
                System.out.println("\n--- Smart Device Controller ---");
                System.out.println("1. Light");
                System.out.println("2. Fan");
                System.out.println("3. TV");
                System.out.println("4. Speaker");
                System.out.println("5. Exit");
                System.out.print("Choose a device (1-5): ");

                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        device = new Light();
                        break;
                    case 2:
                        device = new Fan();
                        break;
                    case 3:
                        device = new TV();
                        break;
                    case 4:
                        device = new Speaker();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        continue;
                    default:
                        System.out.println("Invalid choice. Please choose between 1-5.");
                        continue;
                }

                System.out.print("Do you want to turn ON the device? (yes/no): ");
                String powerChoice = scanner.nextLine().toLowerCase();

                if (powerChoice.equals("yes")) {
                    device.turnOn();

                    String[] modes = device.getAvailableModes();
                    int modeChoice = 0;

                    // Mode selection loop
                    while (true) {
                        System.out.println("Available Modes:");
                        for (int i = 0; i < modes.length; i++) {
                            System.out.println((i + 1) + ". " + modes[i]);
                        }

                        System.out.print("Choose a mode (1-" + modes.length + "): ");

                        try {
                            modeChoice = Integer.parseInt(scanner.nextLine());

                            if (modeChoice >= 1 && modeChoice <= modes.length) {
                                device.setMode(modes[modeChoice - 1]);
                                break; // valid input → break loop
                            } else {
                                System.out.println("❌ Invalid mode number. Try again.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("❌ Please enter a valid number.");
                        }
                    }

                    System.out.print("Do you want to turn OFF the device? (yes/no): ");
                    String offChoice = scanner.nextLine().toLowerCase();

                    if (offChoice.equals("yes")) {
                        device.turnOff();
                    } else {
                        System.out.println("Device remains ON.");
                    }

                } else if (powerChoice.equals("no")) {
                    System.out.println("Device was not turned ON.");
                } else {
                    System.out.println("❌ Invalid input. Expected 'yes' or 'no'.");
                }

            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid input! Please enter numeric values where expected.");
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input type. Please try again.");
                scanner.nextLine(); // clear buffer
            } catch (Exception e) {
                System.out.println("⚠️ Unexpected error: " + e.getMessage());
            }

        } while (choice != 5);

        scanner.close();
    }
}
