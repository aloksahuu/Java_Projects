package com.aurionpro.model;

public class Car implements iVehicle {
	String fuel;
	
	public Car(String fuel) {
		this.fuel=fuel;
	}
	
	public void start() {
		System.out.println("Car started .");
	}
	
	public void stop() {
		System.out.println("Car stopped");
	}
	
	public String fuelType() {
		return fuel;
	}
}
