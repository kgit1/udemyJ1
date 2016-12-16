package udemyJ30Generics;
import java.util.ArrayList;

class Animal{
	static int counter = 0;
	public Animal(){
		System.out.println("Animal: "+ counter);
		counter++;
	}
}
public class UJ30Main {

	public static void main(String[] args) {
		ArrayList<Animal> array1 = new ArrayList<>();
		array1.add(new Animal());
		array1.add(new Animal());
		array1.add(new Animal());
		array1.add(new Animal());
		
	}

}
