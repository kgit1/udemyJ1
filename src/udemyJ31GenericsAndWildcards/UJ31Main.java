package udemyJ31GenericsAndWildcards;

import java.util.ArrayList;

class Machine{
	private static int counter=0;
	public Machine(){
		System.out.println("machine number: "+ counter);
		counter++;
	}
	
	public void start(){
		System.out.println("Machine started!");
	}
	
	@Override
	public String toString() {
		return "I am a Machine";
	}
	
	
}

class Camera extends Machine{
	@Override
	public String toString() {
		return "I am a Camera";
	}
	
}

public class UJ31Main {

	public static void main(String[] args) {
		ArrayList<Machine> list1 = new ArrayList<>();
		list1.add(new Machine());
		list1.add(new Machine());
		list1.add(new Machine());
		showList1(list1);
		
		ArrayList<Camera> list2= new ArrayList<>();
		
		list2.add(new Camera());
		list2.add(new Camera());
		list2.add(new Camera());
		showList2(list2);
		showList3(list2);
		showList4(list2);
	}
	public static void showList1(ArrayList<Machine> list){
		for (Machine string : list) {
			System.out.println(string);
		}		
	}
	//with wildCard
	public static void showList2(ArrayList<?> list){
		for (Object string : list) {
			System.out.println("wildcard generic - "+string);
		}		
	}
	
	public static void showList3(ArrayList<? extends Machine> list){
		for (Machine string : list) {
			System.out.println("wildcard generic which extends defined class or his parent - "+string);
			string.start();
		}		
	}
	
	public static void showList4(ArrayList<? super Camera> list){
		for (Object string : list) {
			System.out.println("wildcard generic which extends defined class or his superClass - "+string);
//			string.start();
		}		
	}
	
	
}
