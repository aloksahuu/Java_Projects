package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.models.Circle;

public class CircleTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		float radius = scanner.nextFloat();
		Circle circle = new Circle(radius);
		
		System.out.println("The area of circle is :"+circle.calculateArea());
		
	}
}
