package com.aurionpro.Ecommerce.model;

public class NetBanking implements PaymentGateway {
    public boolean pay(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive.");
            return false;
        }

        System.out.println("Paid ₹" + amount + " using Net Banking.");
        return true;
    }

    public void refund(double amount) {
        System.out.println("Refunded ₹" + amount + " to Net Banking.");
    }
}
