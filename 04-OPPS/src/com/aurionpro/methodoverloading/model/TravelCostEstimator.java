package com.aurionpro.methodoverloading.model;

public class TravelCostEstimator {

	// 1. Estimate with only distance
	public int estimate(int distance) {
		return 10 * distance;
	}

	// 2. Estimate with distance and number of passengers
	public int estimate(int distance, int passengers) {
		return 10 * distance * passengers;
	}

	// 3. Estimate with distance, passengers, and AC option
	public double estimate(int distance, int passengers, boolean AC) {
		int total = 10 * distance * passengers;
		if (AC) {
			return total + total * 0.2;  // 20% extra for AC
		} else {
			return total;
		}
	}
}
