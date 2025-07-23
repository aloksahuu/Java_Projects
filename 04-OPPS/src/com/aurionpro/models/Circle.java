package com.aurionpro.models;

public class Circle {
	float radius;
	
	public Circle(float radius) {
		this.radius=radius;
	}
	
	public double calculateArea() {
		double area = 3.14*radius*radius;
		return area;
	}
//	public void display() {
//		System.out.println("The area of circle is :"+area);
//	}
}
