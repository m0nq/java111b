class MyRectangle {
	
	double x;
	double y;
	double width;
	double height;

	public void MyRectangle() {

	}

	public void setHeight(double value) {
		height = value;
	}

	public void setWidth(double value) {
		width = width;
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

	public void setOrigin(double horizontal, double vertical) {
		// set the length and width at the location of x & y
	}

	public double getArea() {
		return width * height;
	}

	public boolean containsPoint(double x, double y) {
		return true;
	}

	public boolean isLargerThan(MyRectangle otherRectangle) {

		return getArea() > otherRectangle.getArea();

	}
}
