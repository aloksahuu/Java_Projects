package com.aurionpro.model;

public class Bike implements VehicleControl {
    @Override
    public void start() {
        System.out.println(" Bike started.");
    }

    @Override
    public void stop() {
        System.out.println(" Bike stopped.");
    }

    @Override
    public void changeGear(int gear) {
    	  if(gear>=0&& gear<=5) {
          	System.out.println("Bike gear changed to :"+gear);
          }else {
          	System.out.println("Invalid gear .");
          }
    }
}
