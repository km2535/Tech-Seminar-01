package org.example.interfaceExample;

public class Rectangle {
	private final double width;
	private final double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	double area(){
		return width * height;
	}
}
