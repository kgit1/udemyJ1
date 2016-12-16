package udemyJ61ComplexDataTypesCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UJ61Main {
	public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

	public static String[][] drivers = { { "Fred", "Sue", "Pete" }, { "Sue", "Richard", "Bob", "Fred" },
			{ "Pete", "Mary", "Bob" } };

	public static void main(String[] args) {
		Map<String, Set<String>> personnel = new HashMap<>();

		for (int i = 0; i < vehicles.length; i++) {
			String vehicle = vehicles[i];

			String[] driversList = drivers[i];

			Set<String> driverSet = new LinkedHashSet<String>();

			for (String driver : driversList) {
				driverSet.add(driver);
			}

			personnel.put(vehicle, driverSet);
		}

		printMap1(personnel);
		System.out.println("------------------");
		
		printMap2(personnel);
		System.out.println("------------------");
		
		printMap3(personnel);
		System.out.println("------------------");

		// Set<String> driversList = personnel.get("helicopter");
		// for (String driver : driversList) {
		// System.out.println("Driver "+driver);
		// }

	}

	public static void printMap1(Map<String, Set<String>> personnel) {
		for (String vehicle : personnel.keySet()) {
			System.out.println(firstCharUp(vehicle)+": ");
			for (String driver : personnel.get(vehicle)) {
				System.out.println("\t\tdriver " + driver);
			}
		}
	}

	public static void printMap2(Map<String, Set<String>> personnel) {
		for (Entry<String, Set<String>> entry : personnel.entrySet()) {
			String key = firstCharUp(entry.getKey());
			Set<String> set = entry.getValue();
			for (String value : set) {
				System.out.println(key + ": driver-" + value);
			}
		}
	}

	public static void printMap3(Map<String, Set<String>> personnel) {
		Iterator<Entry<String, Set<String>>> it = personnel.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Set<String>> entry = it.next();
			String key = firstCharUp(entry.getKey());
			Set<String> set = entry.getValue();
			for (String value : set) {
				System.out.println(key + ": driver-" + value);
			}
		}
	}
	
	public static String firstCharUp(String string){
		return new StringBuilder().append(Character.toUpperCase(string.charAt(0)))
				.append(string.substring(1)).toString();
	}

}
