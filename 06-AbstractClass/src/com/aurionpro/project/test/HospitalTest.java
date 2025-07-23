package com.aurionpro.project.test;

import com.aurionpro.project.model.*;

public class HospitalTest {
	public static void main(String[] args) {

	
		String[] patients = {"Shruti", "Payal", "Deep"};

		
		HospitalStaff doc1 = new Doctor(101, "Dr. Alok", "Cardiology", "Cardiologist", patients);
		HospitalStaff nurse1 = new Nurse(201, "Anshika", "ICU", "Night");

	
		HospitalStaff[] staffList = new HospitalStaff[2];
		staffList[0] = doc1;
		staffList[1] = nurse1;

		
		for (HospitalStaff staff : staffList) {
			System.out.println(staff.toString());
			staff.work();
			System.out.println(); // line break
		}
	}
}
