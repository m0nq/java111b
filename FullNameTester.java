class FullNameTester {
	public static void main(String[] args) {
	
		FullName f = new FullName();

		f.setFirst("Helen");
		f.setLast("Keller");
		f.setMiddle('A');

		System.out.println(f.toString());
		System.out.println(f.monogram());
	}
}