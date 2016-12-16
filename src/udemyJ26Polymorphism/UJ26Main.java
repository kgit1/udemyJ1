package udemyJ26Polymorphism;
public class UJ26Main {

	
	public static void main(String[] args) {
		Plant plant1 = new Plant();		
		Tree tree = new Tree();
		
		Plant plant2 = tree;
		plant1.grow();
		plant2.grow();
		tree.shedLeaves();
		tree.fall(); 
		
		doGrow(tree);
		
	}
	
	public static void doGrow(Plant plant){
		plant.grow();
		}

	
}
