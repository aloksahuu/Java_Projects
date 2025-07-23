package com.aurionpro.model;

public class Car implements VehicleControl {
    @Override
    public void start() {
        System.out.println(" Car started.");
    }

    @Override
    public void stop() {
        System.out.println(" Car stopped.");
    }

    @Override
    public void changeGear(int gear) {
        if(gear>=0&& gear<=6) {
        	System.out.println("Car gear changed to :"+gear);
        }else {
        	System.out.println("Invalid gear .");
        }
    }
}

