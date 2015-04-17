import java.util.*;

class Circle extends Shape {
	
	protected double radius;

	public Circle(double value) {
		
		radius = value;
	}

	public Circle() {
		
		this(1.0);
	}

	public void getArea() {

		double area = Math.PI * Math.pow(radius, 2);

		System.out.printf("%.2f", area);
	}

	public void getCircumference() {

		double circumference = Math.PI * 2 * radius;

		System.out.printf("%.2f", circumference);
	}
}