package udemyJ17SettersAndThis;
class Frog{
	private String name;
	private int age;
	
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}
public class UJ17Main {

	public static void main(String[] args) {
		Frog frog1=new Frog();
//		frog1.name ="Bertie";
//		frog1.age=1;
		frog1.setName("Bebertie");
		frog1.setAge(2);
		System.out.println(frog1.getAge());
		System.out.println(frog1.getName());
	}

}
