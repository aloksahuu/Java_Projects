package com.aurionpro.model;

public class Plugin {
    private double version;  

    private Plugin(double version) {
        this.version = version;
    }

    public void execute() {
        System.out.println("Plugin executed");
    }
}
