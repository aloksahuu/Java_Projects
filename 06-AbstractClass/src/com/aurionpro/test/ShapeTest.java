package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Shape;
import com.aurionpro.model.Square;
import com.aurionpro.model.Triangle;

public class ShapeTest {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];

		shapes[0] = new Circle();
		shapes[1] = new Square();
		shapes[2] = new Triangle();

		for (int i = 0; i < shapes.length; i++) {
			shapes[i].draw();
		}
	}
}



