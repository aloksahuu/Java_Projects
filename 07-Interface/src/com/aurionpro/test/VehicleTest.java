package com.aurionpro.test;

import com.aurionpro.model.Bike;
import com.aurionpro.model.Car;
import com.aurionpro.model.iVehicle;

public class VehicleTest {
	public static void main(String[] args) {
		iVehicle[] vehicle = new iVehicle[2];
		vehicle[0]= new Car("Diesel");
		vehicle[1]= new Bike();
		
		for(iVehicle v : vehicle) {
			v.start();
			System.out.println("Fuel Type :"+v.fuelType());
			v.stop();
			System.out.println(" ------------------------- ");
		}
	}
}
