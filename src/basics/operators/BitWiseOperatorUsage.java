package basics.operators;

public class BitWiseOperatorUsage {

	public static void main(String[] args) {
		// Multiplication and division
		System.out.println(3 << 2);
		System.out.println(8 >> 3);
		
		
		// Odd and even check
		int x = 1376;
		int y = 17;
		
		System.out.println(x & 1);
		System.out.println(y & 1);
		
		if((x & 1) == 0) {
			System.out.println(x + " is even");
		}else {
			System.out.println(x + " is odd");
		}
		
//		2.	Swap or exchange two numbers without using any temporary variable
		
		int a = 4512;
		int b = 15789;
		
		System.out.println("Before swap a = " + a + " and b = " + b);
		
		// XOR operator if applied on two operands and then applied again on one of the number
		// it will give another number
		
		a = a ^ b;
		
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swap a = " + a + " and b = " + b);

	}

}
