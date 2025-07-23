package com.aurionpro.model;

public class Car extends Vehicle {
	String fuelType;
	int numSeats;
	
	 public Car(String brand, String model, int speed, String fuelType, int numSeats) {
	        super(brand, model, speed);
	        this.fuelType = fuelType;
	        this.numSeats = numSeats;
	    }
	 
	 @Override
	 public void displayInfo() {
		 super.displayInfo();
		 System.out.println("Fuel Type :"+fuelType+", Seats: "+numSeats);
	 }
}

