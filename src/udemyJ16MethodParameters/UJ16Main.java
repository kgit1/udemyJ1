package udemyJ16MethodParameters;
class Robot{
	public void speak(String text){
		System.out.println(text);
	}
	public void jump(int height){
		System.out.println("Jumping: "+height+" meters high");
	}
	public void move(String direction, double distance){
		System.out.println("Moving: "+ distance+" meters in direction "+ direction);
	}
}
public class UJ16Main {

	public static void main(String[] args) {
		Robot sam = new Robot();
		
		sam.speak("Hi I'm Sam.");
		sam.jump(7);
		sam.move("west",12.2);
		String greeting = "Hello there";
		sam.speak(greeting);
	}

}
