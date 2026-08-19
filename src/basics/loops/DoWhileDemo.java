package basics.loops;

public class DoWhileDemo {

	public static void main(String[] args) {
		printOddNumbers();

	}
	
	// Print odd numbers between 1..10
	public static void printOddNumbers() {
		int i = 11;		
		do {
			System.out.println(i);
			i+=2;
		}while(i <= 10);

	}

}
