package udemyJ20StringBuilderBufferAndFormating;

public class UJ20Main {

	public static void main(String[] args) {
		
		//Inefficient - every time changing - 
		//creates new String object
		String info="";
		info+="My name is Bob.";
		info+=" ";
		info+="I am a builder.";
		System.out.println(info);
		
		//More efficient
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		s.append("My name is Roger.")
		.append(" ")
		.append("I am a skydiver.");
		System.out.println(s.toString());
		
		/////Formating/////////////////////
		
		System.out.print("Here is some text.\t"
				+ "That was a tab.\n"
				+ "That was a new line.");
		System.out.println(" More text");
		//Formating integers
		System.out.printf("Total cost %-10d;"
				+ " number quantity %d\n",5,120);
		
		for (int i = 0; i < 20; i++) {
			System.out.printf("%-2d: %s\n",i,"here some text");			
		}
		//Formating floating value
		System.out.printf("Total value: %.2f\n", 5.6782145);
		System.out.printf("Total value: %8.1f\n", 343.435435);
		System.out.printf("Total value: %-8.1f\n", 343.435435);
	}

}
