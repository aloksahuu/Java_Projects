package com.aurionpro.model;

public class DebitCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing Debit Card Payment of Rs. " + amount);
    }
}

