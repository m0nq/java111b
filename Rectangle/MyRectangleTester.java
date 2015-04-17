class MyRectangleTester {
	public static void main(String[] args) {
		
		MyRectangle r1 = new MyRectangle();
		MyRectangle r2 = new MyRectangle();

		r1.setHeight(2);
		r1.setWidth(4);
		r1.setX(10);
		r1.setY(8);
		// r1.setOrigin(3,3);

		if (r1.isLargerThan(r2)) {
			System.out.println("r1's bigger!");
		} else {
			System.out.println("r2's bigger!");
		}
	}
}