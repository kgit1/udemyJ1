package udemyJ10Arrays;

public class UJ10Main {

	public static void main(String[] args) {
		int value = 7;
		
		int [] values1;
		values1 = new int[10];
		int values2 [] = new int[22];
		int values3[]={2,3,4,5,1,6,1,7};
		values2[0]=10;
		
		System.out.println(values1[0]);
		System.out.println(values2[0]);
		System.out.println(values3[0]);
		
		for (int i = 0; i < values3.length; i++) {
		System.out.println("values["+i+"] = "+values3[i]);	
		}

	}

}
