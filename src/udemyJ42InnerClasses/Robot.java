package udemyJ42InnerClasses;
import java.net.StandardSocketOptions;

public class Robot {

	private int id;

	private class Brain {
		public void think() {
			System.out.println("Robot: id" + id + " is thinking");
		}
	}

	public static class Battery {
		public void charge() {
			System.out.println("Battery charging");
		}
	}

	public Robot(int id) {
		this.id = id;
	}

	public void start() {
		System.out.println("============");
		System.out.println("Strating robot: id" + id);
		System.out.println("____________");
		Brain brain1 = new Brain();
		brain1.think();
		
		final String name = "Robert";

		class Temp {
			public void doSomething() {
				System.out.println("ID is: " + id);
				System.out.println("My name is: " + name);
			}
			}
			Temp temp=new Temp();
			temp.doSomething();
			System.out.println("============");
	}

}
