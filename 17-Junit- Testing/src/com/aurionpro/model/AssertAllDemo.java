package com.aurionpro.model;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class AssertAllDemo {
	@Test

	public void testUserDetails() {
		String name = "Amit";
		int age = 30;
		String city = "Mumbai";

//		assertAll("User details", () -> assertEquals("Amit", name), () -> assertEquals(30, age),
//				() -> assertEquals("Mumbai", city));
		assertAll("User details", () -> assertEquals("Amit", name), () -> assertTrue(age > 18),
				() -> assertEquals("Mumbai", city));
	}

	private Random random = new Random();

	@RepeatedTest(10)
	public void testRandomNumberInRange() {
		int number = random.nextInt(100) + 1; // generates a number between 1 and 100
		System.out.println("Generated number: " + number);

		// Verify that the number is within the range 1 to 100
		assertTrue(number >= 1 && number <= 100);
	}
}
