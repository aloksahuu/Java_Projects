package com.aurionpro.methodoverloading.model;

public class AreaCalculator {
	int side;
	int length , bredth;
	double radius;
	
	public int area(int side) {
		return side*side;
	}
	
	public int area(int length, int breath) {
		return length*breath;
	}
	
	public double area(double radius) {
		return 3.14*radius*radius;
	}
}
