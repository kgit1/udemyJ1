package udemyJ54UsingCustomObjectsInSetsAndASKeysInMaps;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class UJ54Main {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("one", 1);

		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}

		Set<String> set = new LinkedHashSet<>();
		set.add("dog");
		set.add("cat");
		set.add("mouse");
		set.add("dog");
		System.out.println(set);

		Map<Person, Integer> map1 = new HashMap<>();
		Person p1 = new Person(0, "Bob");
		Person p2 = new Person(1, "Sue");
		Person p3 = new Person(2, "Mike");
		Person p4 = new Person(1, "Sue");
		map1.put(p1, 1);
		map1.put(p2, 2);
		map1.put(p3, 3);
		map1.put(p4, 1);
		for (Person p : map1.keySet()) {
			System.out.println(p + ": " + map1.get(p));
		}

		System.out.println(map1);
	}
}
class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "\n{Person [id=" + id + ", name=" + name + "]}";
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

}
