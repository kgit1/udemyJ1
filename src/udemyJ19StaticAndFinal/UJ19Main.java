package udemyJ19StaticAndFinal;
class Thing{
	public final static int LUCKY_NUMBER = 7;
	
	public String name;
	public static String description;
	
	public static int count = 0;
	
	public int id;
	
	public Thing(){
		id=count;
		count++;
	}
	public void showName(){
		System.out.println("Objects id: "+id+", "+description +" : "+name);
	}
	public static void showInfo(){
		System.out.println("Hello");
	}
}
public class UJ19Main {

	public static void main(String[] args) {
		Thing.description = "I am a thing";
		Thing.showInfo();
		System.out.println("Before creating objects, count is: "+Thing.count);
		System.out.println(Thing.description);
		Thing thing1=new Thing();
		Thing thing2 = new Thing();
		thing1.name="Bob";
		thing2.name="Sue";
		thing1.showName();
		
		thing2.showName();
		System.out.println(Math.PI);
//		Math.PI = 3;
		System.out.println(Thing.LUCKY_NUMBER);
		System.out.println("After creating objects, count is: "+Thing.count);
	}

}
