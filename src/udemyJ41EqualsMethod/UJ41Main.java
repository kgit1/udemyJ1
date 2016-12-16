package udemyJ41EqualsMethod;
class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}

public class UJ41Main {

	public static void main(String[] args) {
		Person person1 = new Person(5, "Bobd");
		Person person2 = new Person(5, "Bob");

		System.out.println(person1.equals(person2));

		Double value1 = 7.2;
		Double value2 = 7.2;
		System.out.println(value1 == value2);

		Integer number1 = 6;
		Integer number2 = 6;
		System.out.println(number1 == number2);

		System.out.println("=======");
		String text1 = "Hello";
		String text2 = "Hello";
		String text3 = "Hello.adadsa".substring(0, 5);
		String text4 = new String("Hello");
		System.out.println(text1 == text2);
		System.out.println(text1 == text3);
		System.out.println(text1 == text4);
		System.out.println("=======");
		System.out.println(text1.equals(text2));
		System.out.println(text1.equals(text3));
		System.out.println(text1.equals(text4));
	}

}
