package com.aurionpro.project.model;

public class Nurse extends HospitalStaff {
	String shiftTimings;
	
	public Nurse(int staffId, String name, String department, String shiftTimings ) {
		super(staffId, name, department);
		this.shiftTimings=shiftTimings;
	}
	
	@Override
	public void work() {
		System.out.println(name + " is working in " + department + " department during " + shiftTimings + " shift.");
	}
	
	@Override
	public String toString() {
		return "Nurse: " + name + " (ID: " + staffId + "), Dept: " + department + 
		       ", Shift: " + shiftTimings;
	}

}


