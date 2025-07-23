package com.aurionpro.methodoverloading.model;

public class VolumeCalculator {
	int side;
	int length, breadth,height;
	double radius;
	
	public int volume(int side) {
		return side*side*side;
	}
	
	public int voulme(int length, int breadth, int height) {
		return length *breadth*height;
	}
	
	public double volume(double radius) {
		return 4/3*3.14*radius*radius*radius;
	}
}
