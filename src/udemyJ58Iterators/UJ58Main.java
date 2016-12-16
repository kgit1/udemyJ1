package udemyJ58Iterators;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UJ58Main {

	public static void main(String[] args) {
		List<String> animals = new LinkedList<>();
		animals.add("Fox");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Rabbit");

		Iterator<String> it = animals.iterator();

		// String animal = it.next();
		// System.out.println(animal);
		// System.out.println(it.next());

		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);
			if (value.equals("Cat")) {
				it.remove();
			}
		}

		// modern iteration - Java 5 and later
		for (String animal : animals) {
			System.out.println(animal);
		}

	}

}
