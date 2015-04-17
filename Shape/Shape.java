class Shape {

	protected double length;
	protected double width;

	public Shape() {
		// this()
	}

	public void setLength(double x) {
		
		length = x;
	}

	public double getLength() {
		
		return length;
	}

	public void setWidth(double y) {

		width = y;
	}

	public double getWidth() {

		return width;
	}

	public void getCoordinates() {

		System.out.printf("%.2f\n", width);
	}

	public void getArea() {

		double area = length * width;

		System.out.printf("%.2f\n", area);
	}
}