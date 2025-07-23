package com.aurionpro.SRP.Solution.Patient.model;

public class SendEmail {
	public void email(Patient patient) {
		String patientEmail = patient.getEmail();
		System.out.println("Email has been sent to id :"+patientEmail);
	}
}
