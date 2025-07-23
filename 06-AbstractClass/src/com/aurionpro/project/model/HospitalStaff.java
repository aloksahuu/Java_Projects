package com.aurionpro.project.model;

public abstract class HospitalStaff {
	int staffId;
	String name;
	String department;
	
	public HospitalStaff(int staffId, String name, String department) {
		this.staffId=staffId;
		this.name=name;
		this.department=department;
	}
	
	public abstract void work();
}
