package udemyJ6;

public class UJ6Main {

	public static void main(String[] args) {
		
		boolean cond = 5 == 5;
		System.out.println(cond);
		if (!cond) {
			System.out.println("Yes, it is true!");
		}else if (5>7){
			System.out.println("No, it isn't true!");
		}else{
			System.out.println("Come on!");
		}
		
		int loop = 0;
		while(loop<5){
			System.out.println("Looping : "+ loop);
			if(loop==3){
				break;
			}
			loop+=1;
			System.out.println("Running");
		}
	}

}
