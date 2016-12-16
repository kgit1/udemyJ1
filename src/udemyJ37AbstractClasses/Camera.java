package udemyJ37AbstractClasses;

public class Camera extends Machine {
	private static int id;
	public Camera(){
		id++;
		System.out.println("Camera number: "+id+" machine number: "+super.getId()+" created");
	}

	@Override
	public void start() {
		System.out.println("Starting camera...");

	}

	@Override
	public void doStuff() {
		System.out.println("Do stuff with camera..");

	}

	@Override
	public void shutDown() {
		System.out.println("Shutdown camera...");

	}

}
