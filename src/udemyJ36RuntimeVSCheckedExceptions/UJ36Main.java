package udemyJ36RuntimeVSCheckedExceptions;

public class UJ36Main {

	public static void main(String[] args) {
		int value = 7;
		
		//delenie na nol' - Runtime Exception
		//Runtime Exception-i lutshe ne hendlit', 
		// potomu 4to oni ukazivayut na to 4to v programme
		// ser'eznaya oshibka i lutshe pust' viletat
		// poka ne popravish 4em hendlit' ee i ne ponimat
		// opasnosti
		try{
		value = value/0;
		}catch(ArithmeticException e){
			System.out.println("Error: Divide by zero");
		}
		System.out.println(value);		
				
//		String text=null;
//		System.out.println(text.length());
		
		String[] texts={"one","two","three"};
		try{
		System.out.println(texts[3]);
		}catch(RuntimeException e){
			System.out.println(e.toString());
		}
	}

}
