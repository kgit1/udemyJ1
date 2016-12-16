package udemyJ14Methods;

class Person{
	//Instance variables(data or "state")
	String name;
	int age;
	
	//Classes can contain
	
	//1.Data
	//2. Subroutines(methods)
	void speak(){
		for (int i = 0; i < 3; i++) {
			System.out.println("My name is: "+name+" and I am "+age+" years old");			
		}
	}
	void sayHello(){
		System.out.println("Hello there!");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class UJ14Main {
public static void main(String[] args) {
	Person person1=new Person();
	person1.name="Joe Bloggs";
	person1.age=37;
	
	Person person2 = new Person();
	person2.name = "Sarah Smith";
	person2.age=20;
	
	System.out.println(person1);
	System.out.println(person1.name);
	person1.speak();
	person2.speak();
	person1.sayHello();
}
}
