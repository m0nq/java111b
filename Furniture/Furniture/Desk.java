class Desk extends Table {
	
	private int drawerCount;

	public Desk(double w, double ar, int count) {

		super(w, ar);
		drawerCount = count;
	}

	public int getDrawerCount() {

		return drawerCount;
	}

	public void setDrawerCount(int d) {

		drawerCount = d;
	}
}