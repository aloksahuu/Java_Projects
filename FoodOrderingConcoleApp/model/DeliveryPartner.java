package com.aurionpro.FoodOrderingConcoleApp.model;

public class DeliveryPartner {
    private int id;
    private String name;
    private String contact;

    // ✅ Constructor
    public DeliveryPartner(int id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    // ✅ Getters (optional but useful)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    // ✅ toString() method (optional for debugging)
    @Override
    public String toString() {
        return "DeliveryPartner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}

