package com.aurionpro.methodoverloading.Test;

import java.util.Scanner;
import com.aurionpro.methodoverloading.model.TravelCostEstimator;

public class TravelCostEstimatorTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TravelCostEstimator estimator = new TravelCostEstimator();

		System.out.print("Enter distance in km: ");
		int distance = scanner.nextInt();

		System.out.println("Cost for distance only: ₹" + estimator.estimate(distance));

		System.out.print("Enter number of passengers: ");
		int passengers = scanner.nextInt();

		System.out.println("Cost for distance and passengers: ₹" + estimator.estimate(distance, passengers));

		System.out.print("Do you want AC? (yes/no): ");
		scanner.nextLine(); // clear buffer
		String acInput = scanner.nextLine();
		boolean ac = acInput.equalsIgnoreCase("yes");

		System.out.println("Total cost (with AC choice): ₹" + estimator.estimate(distance, passengers, ac));

		scanner.close();
	}
}

