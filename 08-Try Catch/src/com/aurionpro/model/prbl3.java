package com.aurionpro.model;

import java.util.Scanner;

public class prbl3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int balanace =10000;
		try {
			System.out.println("Enter amount to withdraw : ");
			int withdraw = scanner.nextInt();
			if(withdraw>balanace) {
				throw new ArithmeticException("Insufficient balance.");
			}else if (withdraw <=0) {
				throw new IllegalAccessError("Invalid amount . Please enter an amount greater than 0.");
			}
			
			balanace -= withdraw;
			System.out.println("Withdeawal successfull. Remaining balanace :"+balanace);
		}catch (ArithmeticException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Transaction session ended.");
        }
	}
	
}
