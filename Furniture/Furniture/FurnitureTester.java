class FurnitureTester {
	public static void main(String[] args) {

		Furniture[] array = new Furniture[10];

		array[0] = new Desk(40.0, 76.8, 3);
		array[1] = new Couch(80.0, 2, false);
		array[2] = new Furniture(33.5);
		array[3] = new Seat(20.2, 1);
		array[4] = new Chair(48.9, 5);
		array[5] = new Couch(87.0, 4, false);
		array[6] = new Table(52.9, 54.6);
		array[7] = new Desk(40.0, 76.8, 3);
		array[8] = new Couch(80.0, 2, true);
		array[9] = new Furniture(33.5);

		for (int i = 0; i < array.length - 1; i++) {
			
			System.out.println(array[i]);
		}
	}

	public static double totalWeight(Furniture[] things) {

		double total = 0.0;

		for (int i = 0; i < things.length - 1; i++) {
			
			total = things[i].getWeight();
		}

		return total;
	}
}