class FullName {
	private String firstName;
	private String lastName;
	private char middleInitial;

	public FullName(String first, String last) {
		firstName = first;
		lastName = last;
	}

	public void setFirst(String info) {
		firstName = info;
	}

	public void setLast(String info) {
		lastName = info;
	}

	public void setMiddle(char info) {
		middleInitial = info;
	}

	public String toString() {
		return firstName + " " + middleInitial + ". " + lastName;
	}

	public String monogram() {
		return firstName.charAt(0) + ". " + middleInitial + ". " + lastName.charAt(0) + ". ";
	}
}