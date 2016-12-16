package udemyJ37AbstractClasses;

public abstract class Machine {
	private static int id;
	
	public Machine(){
		id++;
	}
	
	public static int getId() {
		return id;
	}

	public abstract void start();	
	public abstract void doStuff();
	public abstract void shutDown();
	
	public void run(){
		System.out.println("Machine run");
		start();
		doStuff();
		shutDown();
		System.out.println();
	}
}
