package udemyJ26Polymorphism;
public class Tree extends Plant {

	@Override
	public void grow() {
		System.out.println("Tree growing");
	}
	public void shedLeaves(){
		System.out.println("Leaves shedding");
	}
	public void fall(){
		System.out.println("Tree falling");
	}

}
