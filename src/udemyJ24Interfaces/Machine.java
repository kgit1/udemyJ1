package udemyJ24Interfaces;
public class Machine implements Info,IStartable{
	private int id = 7;

	public Machine(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public void start() {
		System.out.println("Machine started!");
	}	

	@Override
	public void stop() {
		System.out.println(("Machine stoped"));
		
	}
	
	@Override
	public void showInfo() {
		System.out.println("Machine ID is: "+id);
		
	}
}
