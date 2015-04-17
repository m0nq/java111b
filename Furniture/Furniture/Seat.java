class Seat extends Furniture {
	
	private int capacity;

	public Seat(double w, int cap) {

		super(w);
		capacity = cap;
	}

	public int getCapacity() {

		return capacity;
	}

	public void setCapacity(int c) {

		capacity = c;
	}
}