package com.aurionpro.model;

public class Truck implements VehicleControl {
    @Override
    public void start() {
        System.out.println(" Truck started.");
    }

    @Override
    public void stop() {
        System.out.println(" Truck stopped.");
    }

    @Override
    public void changeGear(int gear) {
    	if (gear >= 0 && gear <= 8) {
            System.out.println(" Truck gear changed to: " + gear);
        } else {
            System.out.println(" Invalid gear for Truck.");
        }
    }
}

