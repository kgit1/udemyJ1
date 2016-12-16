package udemyJ56NaturalOrdering;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person> {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person p) {
		// sort by name
		// return name.compareTo(p.name);

		// sort by name length
		// v nashem slu4ae mi teryaem v TreeSet-e element izza togo
		// 4to dlina u dvuh sovpadaet,
		// a s comparatorom TreeSet na4inaet na unikal'nost' proveryat'
		// sna4ala po comparatoru,
		// a uze potom po equalsu i vidya dva itema odinakovoi dlini -
		// on s4itaet ih odinakovimi
		// return (name.length() > p.name.length()) ? 1 : (name.length() <
		// p.name.length()) ? -1 : 0;

		// ispravlenii variant
		return (name.length() > p.name.length()) ? 1 : (name.length() < p.name.length()) ? -1 : name.compareTo(p.name);
	}
}

public class UJ56Main {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		SortedSet<Person> set = new TreeSet<>();

		addElements(list);
		addElements(set);

		Collections.sort(list);

		showElements(list);
		System.out.println();
		showElements(set);

	}

	private static void addElements(Collection<Person> col) {
		col.add(new Person("Joe"));
		col.add(new Person("Sue"));
		col.add(new Person("Juliet"));
		col.add(new Person("Clare"));
		col.add(new Person("Mike"));
	}

	private static void showElements(Collection<Person> col) {
		for (Person string : col) {
			System.out.println(string);
		}
	}
}
