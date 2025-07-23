package com.aurionpro.LSP.solution.model;

public class SquareArea implements IShape {
	private int side;
	
	
	public SquareArea(int side) {
		this.side=side;
		
	}
	
	public int getSide() {
		return side;
	}
	
	
	@Override
	public double getArea() {
		return (side*side);
	}
}
