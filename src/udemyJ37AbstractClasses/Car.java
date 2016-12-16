package udemyJ37AbstractClasses;

public class Car extends Machine {
	private static int id;
	public Car(){
		id++;
		System.out.println("Car number: "+id+" machine number: "+super.getId()+" created");
	}
	@Override
	public void start() {
		System.out.println("Starting car...");

	}

	@Override
	public void doStuff() {
		System.out.println("Do stuff in car...");
	}

	@Override
	public void shutDown() {
		System.out.println("Shutdown car...");

	}

}
