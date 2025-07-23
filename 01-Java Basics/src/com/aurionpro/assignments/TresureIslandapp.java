package com.aurionpro.assignments;

import java.util.Scanner;

public class TresureIslandapp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Treasure Island.");
		System.out.println("Your mission is to find the treasure.");

		// First decision
		System.out.print("left or right? ");
		String direction = scanner.nextLine().trim().toLowerCase();

		if (direction == "right") {
			System.out.println("Fall into a hole. Game Over.");
		} else {
			System.out.println("swim or wait?");
			String action = scanner.nextLine().trim().toLowerCase();

			if (action == "swim") {
				System.out.println("Attacked by trout. Game Over.");
			} else {
				System.out.print("Which door? (red, blue, yellow): ");
				String door = scanner.nextLine().trim().toLowerCase();
				switch (door) {
				case "red":
					System.out.println("Burned by fire. Game Over.");
					break;
				case "blue":
					System.out.println("Eaten by beasts. Game Over.");
					break;
				case "yellow":
					System.out.println("You Win!");
					break;
				default:
					System.out.println("Game Over.");

				}
			}
			scanner.close();
		}
	}
}
