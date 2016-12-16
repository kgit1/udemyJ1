package udemyJ51HashMap;

import java.util.HashMap;
import java.util.Map;

public class UJ51Main {

	public static void main(String[] args) {
		//hashmap ne poddergivaet kako-nibud' poryadka elementov
		HashMap<Integer, String> map = new HashMap<>();
		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(6, "Six");
		map.put(4, "Four");
		map.put(2, "Two");
		map.put(6, "Hello");
		
		
		System.out.println(map.get(4));		
		System.out.println(map.get(2));		
		System.out.println(map.get(1));		
		System.out.println(map.get(6));
		
		System.out.println("=================");
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry);
		}
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+" : "+value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String [][] s = new String[2][2];
//		String [] a = {"1","2","3","4"};
//		s[0]=a;
//		
//		for (int i = 0; i < s.length; i++) {
//			System.out.println();
//			for (int j = 0; j < s[i].length; j++) {
//				
//				System.out.print(s[i][j]+" ");
//			}
//		}
	}

}
