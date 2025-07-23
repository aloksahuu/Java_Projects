package com.aurionpro.SRP.Solution.Patient.model;

public class FormatingRecord {
	public void format(Patient patient) {
		System.out.println("-----Patient details-----");
		System.out.println("Name :" + patient.getName());
		System.out.println("Email id :"+ patient.getEmail());
	}
}
