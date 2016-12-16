package udemyJ22Inheritance;

public class Car extends Machine{
	
	public void wipeWindShield(){
		System.out.println("Wiping windshield");
	}

	@Override
	public void start() {
			System.out.println("Car started");		
	}

	@Override
	public void stop() {
			System.out.println("Car stoped");
	}	
	public void showInfo(){
		System.out.println("Car name: "+super.getName());
	}
}
