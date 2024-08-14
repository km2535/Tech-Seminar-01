package org.example.interfaceExample;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		//인터페이스로 구현하지 않은 클래스
		Circle circle = new Circle(4);
		Rectangle rectangle = new Rectangle(4, 6);
		circle.area();
		rectangle.area();
		// 메소드 명은 같지만 공통 타입으로 묶을수 없음

		//인터페이스로 구현한 클래스
		List<Shape> shapes = new ArrayList<>();
		CircleShape circleShape = new CircleShape(5);
		RectangleShape rectangleShape = new RectangleShape(4, 6);
		shapes.add(circleShape);
		shapes.add(rectangleShape);
		shapes.forEach(shape -> {
			System.out.println(shape.area());
		});
	}
}
