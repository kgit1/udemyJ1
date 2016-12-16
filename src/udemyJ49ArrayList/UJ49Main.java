package udemyJ49ArrayList;

import java.util.ArrayList;

public class UJ49Main {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(50);
		numbers.add(20);
		numbers.add(13);
		numbers.add(43);
		numbers.add(11);
		numbers.add(1);
		
		System.out.println("For iteration=============");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}		
		
		System.out.println("Foreach iteration=========");
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
		
		//Removing items(careful!)
		numbers.remove(numbers.size()-3);
		System.out.println("/////////////");
		printS(numbers);
		numbers.remove(0);
		System.out.println("/////////////");
		printS(numbers);
	}
	public static void printS(ArrayList<Integer> list){
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
