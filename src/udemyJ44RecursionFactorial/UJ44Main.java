package udemyJ44RecursionFactorial;

public class UJ44Main {

	public static void main(String[] args) {
		// E.g 4! <- factorial 4 = 4*3*2*1
		// calculate(4);
		System.out.println(calculate(0));
		System.out.println(calculate(1));
		System.out.println(calculate(2));
		System.out.println(calculate(3));
		System.out.println(calculate(4));
		System.out.println(calculate(5));
		System.out.println(calculate(6));
		System.out.println(calculate(7));
		System.out.println("=================");
		System.out.println(factorial(0));
		System.out.println(factorial(1));
		System.out.println(factorial(2));
		System.out.println(factorial(3));
		System.out.println(factorial(4));
		System.out.println(factorial(5));
		System.out.println(factorial(6));
		System.out.println(factorial(7));

	}

	public static int calculate(int value) {
		// System.out.println(value);
		if (value == 0 || value == 1) {
			return 1;
		}
		// if (value == 1) {
		// return 1;
		// }
		return calculate(value - 1) * value;
	}

	public static String factorial(int value) {
		if (value == 0 || value == 1) {
			return "Factorial " + value + " = " + 1;
		}
		int f = 1;
		for (int i = value; i > 1; i--) {
			f = f * i;
		}
		return "Factorial " + value + " = " + f;
	}
}
