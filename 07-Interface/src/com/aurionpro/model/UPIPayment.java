package com.aurionpro.model;

public class UPIPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment of Rs. " + amount);
    }
}

