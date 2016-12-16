package udemyJ50LinkedList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UJ50Main {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> list = new LinkedList<>();
		arrayList.add(22);
		arrayList.add(15);
		arrayList.add(47);

		list.add(12);
		list.add(33);
		list.add(78);

//		printList("ArrayList", arrayList);
//		printList("LinkedList", list);
		
//		doTimingsToEnd("ArrayList", arrayList);
//		doTimingsToEnd("LinkedList", list);
		
		doTimingsStart("ArrayList", arrayList);
		doTimingsStart("LinkedList", list);
		
		

	}

	private static void printList(String type, List<Integer> list) {
		System.out.println(type);
		System.out.println(list);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		System.out.println();
	}

	private static void doTimingsToEnd(String type, List<Integer> list) {
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		long end = System.currentTimeMillis();

		System.out.println("Time taken: " + (end - start) + " ms for " + type);
	}
	
	private static void doTimingsStart(String type, List<Integer> list) {
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 1E5; i++) {
			list.add(0,i);
		}
		long end = System.currentTimeMillis();

		System.out.println("Time taken: " + (end - start) + " ms for " + type);
	}

}
