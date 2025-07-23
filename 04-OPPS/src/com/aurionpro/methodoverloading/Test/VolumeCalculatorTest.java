package com.aurionpro.methodoverloading.Test;

import com.aurionpro.methodoverloading.model.VolumeCalculator;

public class VolumeCalculatorTest {
	public static void main(String[] args) {
		int side =10;
		int length = 3;
		int breadth = 4;
		int height = 5;
		double radius = 2.5;
		
		VolumeCalculator volume = new VolumeCalculator();
		System.out.println("Volume of cube is :"+volume.volume(side));
		System.out.println("Volume of cuboid is :"+volume.voulme(length, breadth, height));
		System.out.println("Volume of sphere is :"+ volume.volume(radius));

				
	}
}
//Create a class VolumeCalculator:
// volume(int side) – cube
// volume(int length, int breadth, int height) – cuboid
// volume(double radius) – sphere