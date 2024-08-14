package org.example.interfaceExample;

public class RectangleShape implements Shape{
	private double width;
	private double height;

	RectangleShape(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}
}
