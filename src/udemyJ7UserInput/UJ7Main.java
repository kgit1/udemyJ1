package udemyJ7UserInput;

import java.util.Scanner;

public class UJ7Main {

	public static void main(String[] args) {
		//Create scanner object
		Scanner scan = new Scanner(System.in);
		//Output the prompt
		System.out.println("Enter a line of text: ");
		//Wait for the user to enter a line of text
		String line = scan.nextLine();
		//Output the prompt
		System.out.println("Enter a number: ");
		//Wait for the user to enter a number
		int number = scan.nextInt();
		//Tell them what they entered
		System.out.println("You entered text: "+line);
		System.out.println("You entered number: "+number);

	}

}
