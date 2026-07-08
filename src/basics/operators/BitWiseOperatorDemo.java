package basics.operators;

public class BitWiseOperatorDemo {

	public static void main(String[] args) {
		int x = 5;
		int y = 3;
		
		// Binary representation
		
		String xBinary = String.format("%8s", Integer.toBinaryString(x)).replace(' ', '0');
		String yBinary = String.format("%8s", Integer.toBinaryString(y)).replace(' ', '0');
		
		System.out.println("Binary for x " + xBinary);
		System.out.println("Binary for y " + yBinary);
		
		System.out.println("x & y = " + (x & y));
		System.out.println("x | y = " + (x | y));
		System.out.println("x ^ y = " + (x ^ y));
		System.out.println("~y = " + (~y));
		
		// Shift operators
		String twoBinary = String.format("%8s", Integer.toBinaryString(27)).replace(' ', '0');
		System.out.println("Binary " + twoBinary);
		System.out.println(2 << 2);
		System.out.println(8 >> 2);
		System.out.println(-8 >>> 2);
	}
	
//	00000101
//	00000011
//	---------
//	00000110
	
	//00000000 00000000 00000000 00000011
	//10000000 00000000 00000000 00001000	

}
