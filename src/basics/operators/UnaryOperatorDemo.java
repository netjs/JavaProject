package basics.operators;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		int a = 6;
		int b = -8;
		
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);
		
//		// increment operator
//		a++; // a = a + 1;
//		System.out.println("Value of a is " + a);
//		
//		// decrement operator
//		a--; // a = a - 1;
//		System.out.println("Value of a is " + a);
		
		boolean flag = true;
		// Complement operator
		if(!flag) {
			System.out.println("In if block");
		}
		
		int result = a--;
		
		System.out.println("Result is " + result);
		System.out.println("Value of a is " + a);

	}

}
