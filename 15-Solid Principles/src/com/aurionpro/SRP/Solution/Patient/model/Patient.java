package com.aurionpro.SRP.Solution.Patient.model;

public class Patient {

	private String name;
	private String email;
	
	public Patient(String name, String email) {
		this.name=name;
		this.email=email;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
}
//
//A PatientRecord class handles storing patient data, 
//sending email notifications, and formatting records for printing. 
//Task: Apply SRP by creating specialized classes for each responsibility.