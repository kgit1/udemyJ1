package udemyJ63Lambda;
//
//interface Executable{
//	void execute();
//}
//class Runner{
//	public void run(Executable e){
//		System.out.println("Executing code...");
//		e.execute();
//	}
//}
//public class UJ63Main {
//
//	public static void main(String[] args) {
//		Runner runner = new Runner();
//		
//		System.out.println("======OLD WAY(PRE JAVAS 8)=========");
//		runner.run(new Executable(){
//			@Override
//			public void execute() {
//				System.out.println("Hello there");
//			}});
//		System.out.println("========Lambda=============");
//		/*
//		 () -> {
//				System.out.println("This is code passed in lambda expression");
//				System.out.println("Hello there");
//				System.out.println("More code");			
//				}
//		 */
//		
//		runner.run(() -> System.out.println("Hello there"));
//		
//		runner.run(() -> {
//			System.out.println("This is code passed in lambda expression");
//			System.out.println("Hello there");
//			System.out.println("More code");
//			
//		});
//
//	}
//
//}

class A {
    final void foo() {
        System.out.println("A");
    }
}

class B extends A {
//    public void foo() {
//        System.out.println("B");
//    }
}

public class UJ63Main {
    public static void main(String[] args) {
        A a = new B();
        a.foo();
    }
}   
