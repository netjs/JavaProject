package basics.operators;

public class RelationalOperatorsDemo {

	public static void main(String[] args) {		
		int a = 20;
		int b = 10;
		int c = 20;
		
		System.out.println("is a == b " + (a == b));
		System.out.println("is a != b " + (a != b));
		System.out.println("is a > b " + (a > b));
		System.out.println("is a >= b " + (a >= b));
		System.out.println("is a < b " + (a < b));
		System.out.println("is a <= b " + (a <= b));
		
		if(a == b) {
			System.out.println("Value of a and b is equal");
		}else {
			System.out.println("Value of a and b is not equal");
		}
		
		if(a == c) {
			System.out.println("Value of a and c is equal");
		}
		
		if(a != c) {
			System.out.println("Value of a and c is not equal");
		}
		
		if(a > b) {
			System.out.println("Value of a is greater than b");
		}
		
		if(a >= b) {
			System.out.println("Value of a is greater than or equal to b");
		}
		
		if(a < b) {
			System.out.println("Value of a is less than b");
		}
		
		if(a <= b) {
			System.out.println("Value of a is less than or equal to b");
		}
	}

}
