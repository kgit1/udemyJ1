package udemyJ63Lambda;

interface ExecutableA {
	int execute(int a, int b);
}

interface StringExecutable{
	int execute(String a);
}

class RunnerA {
	public void run(ExecutableA e) {
		System.out.println("Executing code...");
		int value = e.execute(12,13);
		System.out.println("Return value is: "+value);
	}
	public void run(StringExecutable e) {
		System.out.println("Executing code...");
		int value = e.execute("Hello string");
		System.out.println("Return value is: "+value);
	}
}
// Legit lambda expressions//////(lambdas are objects)
/*
  		() -> { System.out.println("This is code passed in lambda expression"
  		System.out.println("Hello there"); System.out.println("More code"
  		}
*/
/*
 		() -> {
			System.out.println("This is code passed in lambda expression");
			System.out.println("Hello there");
			System.out.println("More code");
			return 12;
		}
 */
/*
 		() -> {
			return 12;
		}
 */
/*
 		() -> 8 
 */
/*
 		(int a) -> 8) 
 */
/*
		(int a) -> {
			System.out.println("Hello there");
			return 7+a;
		} 
 */
/*
 		(a) -> {
			System.out.println("Hello there");
			return 7+a;
		} 
 */
/*
 		a -> {
			System.out.println("Hello there");
			return 7+a;
		} 
 */
/*
 		(a,b) -> {
			System.out.println("Hello there");
			return a + b;
		} 
 */

public class UJ63MainA {

	public static void main(String[] args) {
		
		int c = 100;
		
		// must'n do this c = 8;
		
		int d = 77;
		
		RunnerA runner = new RunnerA();

		System.out.println("======OLD WAY(PRE JAVAS 8)=========");
		runner.run(new ExecutableA() {
			@Override
			public int execute(int a,int b) {
				System.out.println("Hello there");
				//can do in anonymous classes
				//because this is new scope
				int d = 8;
				return c + a + b + d;
			}
		});
		System.out.println("========Lambda=============");
		runner.run( (a,b) -> {
			System.out.println("Hello there");			
			//Can't do because lambda isnt fully new scope 
			//int d = 2;
			return a + b + c;
		});
		
		ExecutableA ex = (a,b) -> {
			System.out.println("Hello there");			
			//Can't do because lambda isnt fully new scope 
			//int d = 2;
			return a + b + c;
		};
		
		runner.run(ex);
		
		Object codeblock = (ExecutableA)(a,b) -> {
			System.out.println("Hello there");			
			//Can't do because lambda isnt fully new scope 
			//int d = 2;
			return a + b + c;
		};

	}

}
