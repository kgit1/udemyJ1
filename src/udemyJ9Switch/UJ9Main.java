package udemyJ9Switch;

import java.util.Scanner;

public class UJ9Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a command: ");
		String text = scan.nextLine();
		switch(text){
		case "start":
			System.out.println("Machine started!");
			break;
		case "stop":
			System.out.println("Machine stoped!");
			break;
		default:
			System.out.println("Command not recognized");		
		}
		
	}

}
