class Animal {

	protected String sound;
	protected boolean isAlive;

	public Animal() {
		
		sound = "Yo!";
	}

	public String speak() {
		
		return sound;
	}

	public void setIsAlive(boolean value) {
		isAlive = value; 
	}

	public boolean getIsAlive() {

		return isAlive;
	}
}