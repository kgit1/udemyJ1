package udemyJ25PublicPrivateProtected.defaultP;
import udemyJ25PublicPrivateProtected.world.Field;
import udemyJ25PublicPrivateProtected.world.Oak;
import udemyJ25PublicPrivateProtected.world.Plant;

public class UJ25Main {

	public static void main(String[] args) {
		
//		public --- from anywhere
//		protected --- same class, subclass and same package
//		no modifier --- default --- same package only		
//		private --- only within same class
		
		Plant plant1 = new Plant();
		System.out.println(plant1.name);
		System.out.println(plant1.ID);
		Oak oak1 = new Oak();
		// System.out.println(oak1.name+" " + oak1.size);
		Field field = new Field();
		
//		System.out.println(plant1.height);
		Grass grass = new Grass();
	}

}
