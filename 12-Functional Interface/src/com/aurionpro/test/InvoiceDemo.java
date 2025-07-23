package com.aurionpro.test;

import java.util.function.Consumer;

import com.aurionpro.model.Invoice;

public class InvoiceDemo {
    public static void main(String[] args) {
        // Create 3 invoice objects
        Invoice i1 = new Invoice("Pen", 2, 10.0);
        Invoice i2 = new Invoice("Notebook", 1, 50.0);
        Invoice i3 = new Invoice("Pencil", 5, 5.0);

        // Define a Consumer to print formatted bill line
        Consumer<Invoice> printInvoice = invoice -> {
            double total = invoice.quantity * invoice.price;
            System.out.println("Item: " + invoice.itemName + " | Quantity: " + invoice.quantity + " | Total: ₹" + total);
        };

        // Use the consumer for each invoice
        printInvoice.accept(i1);
        printInvoice.accept(i2);
        printInvoice.accept(i3);
    }
}

