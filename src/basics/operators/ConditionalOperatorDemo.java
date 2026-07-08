package basics.operators;

public class ConditionalOperatorDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 9;
		
		System.out.println("is (a > b) && (a > c) " + ((a > b) && (a > c)));
		System.out.println("is (a > b) || (a > c) " + ((a > b) || (a > c)));
		
		if((a > b) && (a > c)) {
			System.out.println("a is greater than both b and c");
		}
		
		if((a > b) || (a > c)) {
			System.out.println("a is greater than either b or c or may be both");	
		}
		
		// Greatest of 3 numbers
		int greatest;
		
		if((a >= b) && (a >= c)) {
			greatest = a;
		}else if((b >= a) && (b >= c)) {
			greatest = b;
		}else {
			greatest = c;
		}
		System.out.println("Greatest number is " + greatest);
		
		int val1 = 0;
		int val2 = 10;
		
		if(val1 != 0 && val2/val1 >= 2) {
			System.out.println("In if block");
		}
		
	}

}
