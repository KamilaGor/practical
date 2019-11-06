package com.module1.shapes;

import com.module1.shapes.Shape;

public class Triangle implements Shape {
	@Override
	public void draw() {
		System.out.println("I'm drawing a triangle");
	}
}
