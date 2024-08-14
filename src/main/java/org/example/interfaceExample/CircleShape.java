package org.example.interfaceExample;

public class CircleShape implements Shape{
	private final double radius;

	public CircleShape(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return radius * radius * Math.PI;
	}
}
