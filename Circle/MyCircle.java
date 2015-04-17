class MyCircle {
	
	private double radius;
	private double x;
	private double y;

	public MyCircle(double xValue, double yValue, double radialValue) {
		x = xValue;
		y = yValue;
		radius = radialValue;
	}

	public MyCircle() {

	}

	public void setX(double value) {
		x = value;
	}

	public double getX() {
		return x;
	}

	public void setY(double value) {
		y = value;
	}

	public double getY() {
		return y;
	}

	public void setRadius(double value) {
		radius = value;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public boolean doesOverlap(MyCircle otherCircle) {
		return getRadius() + otherCircle.getRadius() >= Math.sqrt(Math.pow(otherCircle.getX() - getX(), 2) + Math.pow(otherCircle.getY() - getY(), 2));
	}
}