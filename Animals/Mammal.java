class Mammal extends Animal {
	
	protected boolean fur;

	public Mammal() {

		fur = true;
	}

	public void getFur() {
		System.out.println(fur);
	}
}