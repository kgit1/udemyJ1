package udemyJ8DoWhile;

import java.util.Scanner;

public class UJ8Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Enter a number: ");
//		int value = scan.nextInt();
//		
//		while(value!=5){
//			System.out.println("Enter a number: ");
//			value = scan.nextInt();
//		}
		int value=0;
		do{
			System.out.println("Enter a number: ");
			value = scan.nextInt();
		}
		while(value!=5);
		
		
		System.out.println("Got 5!");
	}

}
