package udemyJ28CastingNumericalValues;

public class UJ28Main {

	public static void main(String[] args) {
		byte byteValue = 20;        // 8 bit  -128 - 127
		short shortValue = 55;      // 16 bit -32768  - 32767
		char charValue = 34;        // 16bit   0  - 65535
		int intValue = 2;           // 32 bit -2147483648  - 2147483647
		long longValue = 9223372036854775807L;     // 64 bit -9223372036854775808  - 9223372036854775807
		
		float floatValue = 2334.5f; //32	от -1.4e-45f до 3.4e+38f
		float floatValue2 = (float) 343243.54;
		double doubleValue = 34.5;  //64	от -4.9e-324 до 1.7е+308
		double doubleValue2 = (double) 3423432.4353453;
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		intValue = (int)longValue;
		System.out.println(intValue);
		
		//beskone4no
//		for (short i = 0; i < 32768; i++) {
//			System.out.println(i);
//		}
	}

}
