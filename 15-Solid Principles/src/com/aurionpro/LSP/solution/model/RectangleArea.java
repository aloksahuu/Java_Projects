package com.aurionpro.LSP.solution.model;

public class RectangleArea implements IShape {
	
	private int length;
	private int breadth;
	
	public RectangleArea(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	public int getLength() {
		return length;
	}
	public int getBreadth() {
		return breadth;
	}
	
	@Override
	public double getArea() {
		return (length*breadth);
	}

}
