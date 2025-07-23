package com.aurionpro.SRP.Solution.Patient.test;

import com.aurionpro.SRP.Solution.Patient.model.FormatingRecord;
import com.aurionpro.SRP.Solution.Patient.model.Patient;
import com.aurionpro.SRP.Solution.Patient.model.SendEmail;
import com.aurionpro.SRP.Solution.Patient.model.StorePatientData;

public class PatientTest {
	public static void main(String[] args) {
		Patient patient = new Patient("Anshika Dubey", "anshikadubey069@gamil.com");
		
		StorePatientData store =new StorePatientData();
		store.Store(patient);
		
		SendEmail emaill = new SendEmail();
		emaill.email(patient);
		
		FormatingRecord formatt = new FormatingRecord();
		formatt.format(patient);
	}
}
