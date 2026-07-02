package basics.operators;

public class CompoundOperatorDemo {

	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		int c = 8;
		int d = 12;
		int e = 15;
		
		a += 5; // a = a + 5;
		System.out.println("Value of a is " + a);
		
		b -= 3; // b = b - 3;
		System.out.println("Value of b is " + b);
		
		a -= b; // a = a - b;
		System.out.println("Value of a is " + a);
		
		c *= 3; // c = c * 3;
		System.out.println("Value of c is " + c);
		
		d /= 4; // d = d/4;
		System.out.println("Value of d is " + d);
		
		e %= 2; // e = e % 2;
		System.out.println("Value of e is " + e);
	}

}
