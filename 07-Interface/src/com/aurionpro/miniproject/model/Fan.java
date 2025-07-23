package com.aurionpro.miniproject.model;

public class Fan implements IControllable {
    public void turnOn() {
        System.out.println("Fan turned ON");
    }

    public void setMode(String mode) {
        System.out.println("Fan mode set to: " + mode);
    }

    public void turnOff() {
        System.out.println("Fan turned OFF");
  
    }
    
    public String[] getAvailableModes() {
        return new String[] {"Low", "Medium", "High"};
    }
}

