package com.aurionpro.methodoverloading.Test;

import com.aurionpro.methodoverloading.model.AreaCalculator;

public class AreaCalculatorTest {
	public static void main(String[] args) {
		int side = 10;
		int length = 6;
		int breadth = 6;
		double radius = 3;
		
		AreaCalculator area = new AreaCalculator();
		
		System.out.println("Area of Square is :"+area.area(side));
		System.out.println("Area of rectangle is :"+area.area(length, breadth));
		System.out.println("Area of circle is "+ area.area(radius));
	}
}
