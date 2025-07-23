package com.aurionpro.SRP.Solution.Patient.model;

public class StorePatientData {
	public void Store(Patient patient) {
		String name = patient.getName();
		System.out.println(name +" Detail has been stored Succesfully .");
	}
}
