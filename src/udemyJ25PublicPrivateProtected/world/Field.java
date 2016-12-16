package udemyJ25PublicPrivateProtected.world;

public class Field {
	private Plant plant = new Plant();
	public Field(){
		System.out.println("Field created with plant: "+plant.name+" "+plant.size);
	}
}
