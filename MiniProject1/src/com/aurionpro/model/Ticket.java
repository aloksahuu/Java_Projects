package com.aurionpro.model;

public class Ticket {
	private String customerName;
	private TicketType ticketType;
//	private int price;
	private BookingStatus bookingStatus;
	
	public Ticket(String customerName, TicketType ticketType) {
		this.customerName=customerName;
		this.ticketType=ticketType;
		this.bookingStatus=bookingStatus.PENDING;
	}
	
	public void cancelBooking() {
		this.bookingStatus=BookingStatus.CANCELLED;
	}
	
	public void confirmBooking() {
		this.bookingStatus=BookingStatus.CONFIMED;
	}
	
	public void displayTicket() {
		System.out.println("-----Display Ticket Details ------");
		System.out.println("Customer Name :"+customerName);
		System.out.println("Ticket Type :"+ticketType);
		System.out.println("Ticket Price :"+ticketType.getPrice());
		System.out.println("Booking Status :"+bookingStatus);
	}
	
}
