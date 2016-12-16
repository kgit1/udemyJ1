package udemyJ43Enums;

public enum Animal {
	CAT("Fergus"), DOG("Fido"), MOUSE("Jerry");
	private String name;

	Animal(String name) {
		this.name = name;
		System.out.println("Enum created " + name() + " " + name);
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "This " + name() + " is called: " + this.name;
	}
}
