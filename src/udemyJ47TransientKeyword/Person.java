package udemyJ47TransientKeyword;
import java.io.Serializable;

public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8882968952486356320L;
	private transient int id;
	private String name;
	private static int counter;
	
	public Person(){
		System.out.println("Default constructor");
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		counter++;
		System.out.println("Two-argument constructor");
	}
	




	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Person.counter = counter;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]"+" count is: "+counter+" serialVersionUID "+serialVersionUID;
	}

}
