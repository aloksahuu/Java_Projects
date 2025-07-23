package com.aurionpro.model;

public class ElectricCar extends Car {
	int batteryCapacity;
	int ChargingTime;
	
	public ElectricCar(String brand, String model, int speed, String fuelType, int numSeats, int batteryCapacity, int chargingTime) {
		super(brand,model,speed,fuelType,numSeats);
		this.batteryCapacity=batteryCapacity;
		this.ChargingTime=chargingTime;		
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Battery Capacity :"+batteryCapacity+" , Charging Time :"+ChargingTime + "hrs");
	}
}
