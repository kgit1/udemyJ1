package udemyJ25PublicPrivateProtected.world;

public class Plant {
	public String name;
	
	public final static int ID=8;

	private String type;
	
	protected String size;
	
	int height;
	
	public Plant() {
		this.name = "Freddy";
		this.type = "plant";
		this.size="large";
		this.height = 12;
	}

}
