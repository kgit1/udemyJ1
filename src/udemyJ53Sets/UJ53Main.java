package udemyJ53Sets;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UJ53Main {

	public static void main(String[] args) {
		// HashSet does not retain order
		Set<String> set1 = new HashSet<>();
		// LinkedHashSet remembers the order you added items ins
		Set<String> set2 = new LinkedHashSet<>();
		// TreeSet sorts in natural order
		Set<String> set3 = new TreeSet<>();

		checkSet(set1, "cat");

		printSet(populateSet(set1));
		printSet(populateSet(set2));
		printSet(populateSet(set3));

		checkSet(populateSet(set1), "cat");
		checkSet(populateSet(set1), "elephant");

		printSet1(populateSet(set1));
		printSet1(populateSet(set2));
		printSet1(populateSet(set3));

		// Intersection\\\\\\\\\\\\\\\\
		Set<String> set4 = new TreeSet<>();
		set4 = populateSet(set4);
		set4.add("rabbit");
		set4.add("monkey");

		Set<String> intersection = new HashSet<String>(set4);
		System.out.println(intersection);

		// retainAll cuts out of array all elements which not presents in given
		// array
		intersection.retainAll(set2);
		System.out.println(intersection);

		/// Differences//////////
		Set<String> difference = new HashSet<String>(set4);

		// removenAll cuts out of array all elements which presents in given
		// array
		difference.removeAll(set2);
		System.out.println(difference);
	}

	public static void printSet(Set<String> set) {
		System.out.println("==========");
		System.out.println(set.getClass().getSimpleName());
		System.out.println(set);
	}

	public static void printSet1(Set<String> set) {
		System.out.println("==========");
		System.out.println(set.getClass().getSimpleName());
		for (String string : set) {
			System.out.println(string);
		}
	}

	public static void checkSet(Set<String> set, String string) {
		if (set.isEmpty()) {
			System.out.println("This set is empty");
		} else if (set.contains(string)) {
			System.out.println("Set contains string: " + string);
		} else {
			System.out.println("Set doesn't contain string: " + string);
		}
	}

	public static Set<String> populateSet(Set<String> set) {
		set.add("dog");
		set.add("cat");
		set.add("mouse");
		set.add("snake");
		set.add("bear");
		// Adding duplicate items does nothing
		// sets takes only unique items
		set.add("cat");
		return set;
	}

}
