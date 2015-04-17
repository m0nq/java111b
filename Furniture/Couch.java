class Couch extends Seat {

	private boolean converts;

	public Couch(double w, int cap, boolean value) {

		super(w, cap);
		converts = value;
	}

	public boolean getConvertsToBed() {

		return converts;
	}

	public void setConvertsToBed(boolean c) {

		converts = c;
	}
}