package com.aurionpro.model;

import java.util.Scanner;

public class TicketBookingSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter user name:");
		String name = scanner.nextLine();
		
		System.out.println("Select Ticket type :");
		for(TicketType type : TicketType.values()) {
			System.out.println(type + "-₹" + type.getPrice());
		}
		
		System.out.println("Enter ticket type (REGULAR, VIP, PREMIUM): ");
		String inputType = scanner.nextLine().toUpperCase();
		TicketType selectedticket = TicketType.valueOf(inputType);
		
		Ticket ticket = new Ticket(name, selectedticket );
		
		System.out.println("Your booking is created with Pending status. Do you want to ?");
		System.out.println("1. Confirm Booking");
		System.out.println("2. Cancel Booking ");
		System.out.println("Enter choice :");
		int choice = scanner.nextInt();		
		switch (choice) {
		case 1 :
			ticket.confirmBooking();
			break;
			
		case 2:
			ticket.cancelBooking();
			break;
			
		default:
			System.out.println("Invalid choice , Status is Pending.");
		}
		
//		System.out.println("\n---Ticket details ----");
		ticket.displayTicket();
		
		scanner.close();
		
	}
}
