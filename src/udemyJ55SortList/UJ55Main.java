package udemyJ55SortList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		if (len1 > len2) {
			return 1;
		}
		if (len2 > len1) {
			return -1;
		}
		return 0;
	}
}

class StringLengthComparator1 implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return (s1.length() > s2.length()) ? 1 : (s1.length() < s2.length()) ? -1 : 0;
	}
}

class StringLengthReverseComparator1 implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return (s1.length() < s2.length()) ? 1 : (s1.length() > s2.length()) ? -1 : 0;
	}
}

class StringAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}
}

class StringAlphabeticalReverseComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);
	}
}

public class UJ55Main {

	public static void main(String[] args) {
		/////// Sorting strings/////////////////
		List<String> animals = new ArrayList<>();
		animals.add("Cat");
		animals.add("Elephant");
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Snake");
		animals.add("Mangoose");

		Collections.sort(animals);
		for (String animal : animals) {
			System.out.println(animal);
		}
		System.out.println("+++++++++next comparator++++++");

		Collections.sort(animals, new StringLengthComparator());
		for (String animal : animals) {
			System.out.println(animal);
		}
		System.out.println("+++++++++next comparator++++++");

		Collections.sort(animals, new StringLengthComparator1());
		for (String animal : animals) {
			System.out.println(animal);
		}
		System.out.println("+++++++++next comparator++++++");

		Collections.sort(animals, new StringLengthReverseComparator1());
		for (String animal : animals) {
			System.out.println(animal);
		}
		System.out.println("+++++++++next comparator++++++");

		Collections.sort(animals, new StringAlphabeticalComparator());
		for (String animal : animals) {
			System.out.println(animal);
		}
		System.out.println("+++++++++next comparator++++++");

		Collections.sort(animals, new StringAlphabeticalReverseComparator());
		for (String animal : animals) {
			System.out.println(animal);
		}
		System.out.println("+++++++++next comparator++++++");

		/////////////////// Sorting numbers///////////////
		List<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(11);
		numbers.add(36);
		numbers.add(73);
		numbers.add(40);
		numbers.add(1);

		Collections.sort(numbers);
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
		System.out.println("+++++++++next comparator++++++");

		Collections.sort(numbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return -o1.compareTo(o2);
			}
		});
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
		System.out.println("+++++++++next comparator++++++");
		//////// Sorting arbitrary objects//////
		List<Person> people = new ArrayList<>();
		people.add(new Person(1, "Joe"));
		people.add(new Person(2, "Sue"));
		people.add(new Person(3, "Bob"));
		people.add(new Person(4, "Clare"));

		// Sort in order of id reverse
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return (o1.getId() < o2.getId()) ? 1 : (o1.getId() > o2.getId()) ? -1 : 0;
			}
		});

		for (Person person : people) {
			System.out.println(person);
		}
		System.out.println("+++++++++next comparator++++++");

		// Sort in order of name
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		for (Person person : people) {
			System.out.println(person);
		}

	}

}

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}