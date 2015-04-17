class Table extends Furniture {
	
	private double area;

	public Table(double w, double ar) {

		super(w);
		area = ar;
	}

	public double getArea() {

		return area;
	}

	public void setArea(double a) {

		area = a;
	}
}