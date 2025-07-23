package com.aurionpro.model;

public abstract class Shape {
	public String shapeName;
	
	public Shape(String shapeName) {
		this.shapeName=shapeName;
	}
	
	public abstract void draw();
}
