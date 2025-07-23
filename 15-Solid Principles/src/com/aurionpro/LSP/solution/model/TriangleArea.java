package com.aurionpro.LSP.solution.model;

public class TriangleArea implements IShape {
	private int radius;

	public TriangleArea( int radius) {
		this.radius=radius;
		
	}

	public int getSide() {
		return radius;
	}

	@Override
	public double getArea() {
		return ( 3.14*radius*radius );
	}
}
