package udemyJ24Interfaces;
public class UJ24Main {

	public static void main(String[] args) {
		Machine mach1 = new Machine(5);
		mach1.start();

		Person person1 = new Person("Bob");
		person1.greet();
		mach1.showInfo();
		person1.showInfo();
		
		Info info1;
		info1 = new Machine(66);
		info1.showInfo();
		
		Info info2 = new Person("Jane");
		info2.showInfo();
		
		Info info3=person1;
		info3.showInfo();
		
		outputInfo(person1);
	}
	private static void outputInfo(Info info){
		System.out.print("outputInfo: \n\t\t\t");
		info.showInfo();
	}
}
