package udemyJ18Constructors;
class Machine{
	private String name;
	private int code;
	public Machine(){
		System.out.println("Constructor running!");
	name="Arnie";
	}
	public Machine(String name){
		this("Arnie",0);
		System.out.println("Second constructor rnunning!");
	}
	public Machine(String name, int code){
		System.out.println("Third constructor running!");
		this.name=name;
		this.code=code;
	}
	public String getName(){
		return name;
	}
	
}
public class UJ18Main {

	public static void main(String[] args) {
	Machine machine1=new Machine();
	System.out.println("My name is "+machine1.getName());
	Machine machine2 = new Machine("Bertie");
	Machine machine3=new Machine("Chalky",7);
	}

}
