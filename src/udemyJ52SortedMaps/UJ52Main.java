package udemyJ52SortedMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class UJ52Main {

	public static void main(String[] args) {
		// ne podderzivaet poryadok, sortiruet po hash-u
		Map<Integer, String> hashMap = new HashMap<>();
		// podderzivaet poryadok dobavleniya
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		// sortiruet po poryadku i podderzivaet
		Map<Integer, String> treeMap = new TreeMap<>();
		testMap(hashMap);
		testMap(linkedHashMap);
		testMap(treeMap);

	}

	public static void testMap(Map<Integer, String> map){
		System.out.println("==========================");
			System.out.println(map.getClass().getSimpleName());
		
			map.put(9, "Fox");
			map.put(4, "Cat");
			map.put(8, "Dog");
			map.put(1, "Giraffe");
			map.put(0, "Swan");
			map.put(15, "Snake");
			map.put(6, "Bear");
			map.put(2, "Two");
			
			for (Integer key : map.keySet()) {
				String value = map.get(key);
				System.out.println(key+" : "+ value);
			}
			
		}
}
