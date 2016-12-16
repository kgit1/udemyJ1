package udemyJ3;

public class UJ3Main {

	public static void main(String[] args) {
		int myInt = 7;
		String myString = "Udemy: Java for Beginers";
		String blank = " ";
		String name = "Bob";
		String greeting = "Hello";
		
		System.out.println(myString);
		for(int i =0;i<myInt;i++){
			System.out.print(i+1+" ");
			System.out.println(myString);
		}
		System.out.println(greeting+blank+name);
		
		double myDouble = 7.8;
		System.out.println("My number is: "+myDouble);
	}
}
