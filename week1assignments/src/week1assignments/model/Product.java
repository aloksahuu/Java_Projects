package week1assignments.model;

public class Product {
    public String name;
    public double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to display product details
    public void display() {
        System.out.println("Product: " + name + ", Price: ₹" + price);
    }
}
