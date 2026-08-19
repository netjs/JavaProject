package basics.loops;

public class ForLoopDemo {

	public static void main(String[] args) {
//		System.out.println("I love Java programming language");
//		System.out.println("I love Java programming language");
//		System.out.println("I love Java programming language");
//		System.out.println("I love Java programming language");
//		System.out.println("I love Java programming language");
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("I love Java programming language");
		}
		
		System.out.println("After for loop");
		printNumbers();
		
		printNumbersInReverse();
		
		printTable(10);
		
		printEvenNumbers();

	}
	
	// Method to print numbers
	public static void printNumbers() {
		int i = 1;
		for(; i <= 5; ) {
			System.out.println(i);
			i++;
		}
	}
	
	// Method to print numbers in reverse
	public static void printNumbersInReverse() {
		for(int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
	}
	
	// Method to print table of given number from 1 to 10 in form
	// 4 X 1 = 4
	public static void printTable(int num) {
		for(int i = 1; i <=10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
	}
	
	 
	// print even numbers between 1-10
	public static void printEvenNumbers() {
		for(int i = 2; i <=10; i=i+2) {
			System.out.println(i);
		}
	}

}
