package udemyJ12MultiDimensionalArray;

public class UJ12Main {
public static void main(String[] args) {
	int[] values = {2,3,4,12,33,1};
	
	System.out.println(values[2]);
	
	int [][] grid ={{1,2,3,45,1,2,11},		
					{2,4,6,3,8,1},
					{231,2,3,654},
					{99999999}};
	
	for (int[] is : grid) {
		System.out.println();
		for (int i : is) {
			System.out.print(i+" ");
		}
	}
	
	String[][] texts = new String[2][3];
	texts[0][2] = "Abbiba";
	for (String[] strings : texts) {
		System.out.println();
		for (String string : strings) {
			// \t = tab
			System.out.print(string+" \t");
		}
	}
	
	String [][] words = new String[2][];
	System.out.println(words[0]);
	words[0]=new String[3];
	System.out.println(words[0][1]);

}
}
