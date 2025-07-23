package com.aurionpro.model;

public class Bike implements iVehicle{
	public void start() {
		System.out.println("Bike started");
	}
	
	public void stop() {
		System.out.println("Bike Stopped.");
	}
	
	public String fuelType() {
		return "Petrol";
	}
}
