package com.aurionpro.testt;

public class LeapYearOrNot {
	public static void main (String[] args) {
		int year = 1900;
		if( year%4==0 && year%100 != 0) {
			System.out.println("The year is leap year");
		}
		else if (year%4==0 && year%100==0 && year%400==0) {
			System.out.println("The year is leap year");
		}
		else {
			System.out.println("The year is not leap year");
		}
		
	}

}
