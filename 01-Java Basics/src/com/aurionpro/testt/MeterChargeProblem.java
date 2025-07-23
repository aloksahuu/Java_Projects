package com.aurionpro.testt;
import java.util.Scanner;

public class MeterChargeProblem {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of units consumed : ");
		int units_consumed = sc.nextInt();
		int meter_charge = 75;
		int charge = 0;
		if(units_consumed <=100) {
			 charge = units_consumed*5;
		}else {
			if(units_consumed <=250) {
				charge =units_consumed*10;
			}else {
				charge = units_consumed*20;
			}
		}
		int TotalwaterBill = charge + meter_charge;
		System.out.println("Total water bill is : "+ TotalwaterBill);
		
		sc.close();
	}

}
