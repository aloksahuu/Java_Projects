package com.aurionpro.test;

import com.aurionpro.model.Car;
import com.aurionpro.model.ElectricCar;
import com.aurionpro.model.Vehicle;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("Honda", "Unicorn", 100);
		vehicle.displayInfo();
		vehicle.accelerate();
		vehicle.brake();
		
		System.out.println("\n----------------------------");
		Car car = new Car("Honda","City",160,"Petrol",4);
		car.displayInfo();
		car.accelerate();
		car.brake();
		
		System.out.println("\n----------------------------");
		ElectricCar eCar = new ElectricCar("Tesla","CyberTruck",200,"Electric",5,75,2);
		eCar.displayInfo();
		eCar.accelerate();
		eCar.brake();
		
	}
}
