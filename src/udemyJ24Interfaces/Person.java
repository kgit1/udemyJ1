package udemyJ24Interfaces;
public class Person implements Info{
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void greet() {
		System.out.println("Hello there!");
	}

	@Override
	public void showInfo() {
		System.out.println("Person name is: "+name);
		
	}
}
