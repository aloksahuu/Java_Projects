package com.aurionpro.supplier;

import java.util.function.Supplier;

public class RandomNumber {

	public static void main(String[] args) {
		// Create a Supplier that generates random numbers between 0 and 1
		Supplier<Double> randomSupplier = () -> Math.random();

		System.out.println("5 Random Numbers between 0 and 1:");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Random " + i + ": " + randomSupplier.get());
		}
	}
}
