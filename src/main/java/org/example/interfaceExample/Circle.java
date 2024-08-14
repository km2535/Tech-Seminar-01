package org.example.interfaceExample;

public class Circle {
	private final double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	double area(){
		return Math.PI * radius * radius;
	}
}
