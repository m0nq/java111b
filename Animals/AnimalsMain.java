class AnimalsMain {
	public static void main(String[] args) {
		
		Animal a = new Animal();
		
		System.out.println(a.speak());
		System.out.println(a.isAlive());

		Mammal whiskers = new Cat();
		
		System.out.println(whiskers.speak());
		System.out.println(whiskers.getFur());
	}
}