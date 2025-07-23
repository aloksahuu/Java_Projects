package com.aurionpro.model;

public class Vehicle {
	String brand;
	String model;
	int speed;
	
	public  Vehicle(String brand, String model, int speed) {
		this.brand=brand;
		this.model=model;
		this.speed=speed;
	}
	
	public void accelerate() {
		speed +=10;
		System.out.println(brand +" "+ model+" Accelerated Speed: "+speed);
	}
	
	public void brake() {
		speed =0;
//		if(speed<0)speed=0;
		System.out.println(brand+" "+model+" Breaked Speed: "+speed);
	}
	
	public void displayInfo() {
		System.out.println("Brand:"+ brand +", Model: "+model+", Speed: "+speed);
	}
}
