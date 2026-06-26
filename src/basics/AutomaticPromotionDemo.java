package basics;

public class AutomaticPromotionDemo {

	public static void main(String[] args) {
		byte a = 5;
		byte b = 6;
		
		int result = a * b;
		
		int i = 30;
		
		double d = 50;
		
		double r1 = i + d;
		
		System.out.println("Result is " + r1);
		
		short s = 20;
		
		long l = 40;
		
		
		float f = 7;
		
	    float r2 = ((s + i) + l) * f;
	    System.out.println("Result is " + r2);
	    
		byte x = 5;
		
		// 1. rule
		int r3 = x * 2;
		System.out.println("Result is " + r3);
		
		// 2. Explicit type casting
		byte r4 = ((byte)(x * 2));
		System.out.println("Result is " + r4);
		
		//3. Implicit type casting
		x *= 2;
		System.out.println("Result is " + x);
	}

}
