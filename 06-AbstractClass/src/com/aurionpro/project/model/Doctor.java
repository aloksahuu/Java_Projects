package com.aurionpro.project.model;



public class Doctor extends HospitalStaff {
	
	String specialization;
	String [] patients ;
	
	public Doctor(int staffId, String name, String department, String specialization, String[] patients) {
		super(staffId, name, department);
		this.specialization=specialization;
		this.patients=patients;
	}
	
	@Override
	public void work() {
		System.out.println(name + " is treating patients in " + specialization + " specialization.");
	}
	
	@Override
	public String toString() {
		String patientList = "";
		if (patients != null && patients.length > 0) {
			for (String p : patients) {
				patientList += p + ",";
			}
			patientList = patientList.substring(0,patientList.length()-2); // this take substring so that last unnecessary comma can be removed
		}
		
		else {
			patientList = "No patients";
		}

		return "Doctor: " + name + " (ID: " + staffId + "), Dept: " + department +
		       ", Specialization: " + specialization + ", Patients: " + patientList.trim();
	}


}
