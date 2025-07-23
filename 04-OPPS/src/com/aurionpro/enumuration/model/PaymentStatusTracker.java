package com.aurionpro.enumuration.model;

import java.util.Scanner;

public class PaymentStatusTracker {
	
	public static String PrintMessage(PaymentStatus status) {
		switch(status) {
		case SUCCESS :
			return "Your Payment has been Received";
		case PENDING:
			return "Your Payment is pending";
		case CANCELLED:
			return "Your Payment has been Cancelled";
		case FAILED:
			return "Your Payment was Failed";
		default :
			return "ERROR! Please renter the status";
			
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the status : (SUCCESS, PENDING, FAILED, CANCELLED):");
		String userinput = scanner.nextLine().toUpperCase();
		
		PaymentStatus status = PaymentStatus.valueOf(userinput);
		
		System.out.println(PrintMessage(status));
	}
}
