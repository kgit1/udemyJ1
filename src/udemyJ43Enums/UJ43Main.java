package udemyJ43Enums;
public class UJ43Main {
	

	public static void main(String[] args) {
		Animal animal = Animal.CAT;

		switch (animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			break;
		default:
			break;
		
		}
		
		System.out.println(Animal.DOG);
		System.out.println(Animal.DOG.name());
		System.out.println(Animal.DOG.getClass());
		System.out.println(Animal.DOG.getClass().getName());
		System.out.println(Animal.DOG instanceof Enum);
		
		Animal animal2 = Animal.valueOf("CAT");
		System.out.println(animal2);
		

	}

}
