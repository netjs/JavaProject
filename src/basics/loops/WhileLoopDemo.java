package basics.loops;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTable(11);
		
		printOddNumbers();

	}
	
	public static void printTable(int num) {
		int i = 1;
		while(i <= 10) {
			System.out.println(num + " X " + i + " = " + (num * i));
			i++;
		}
		
	}
	
	// Print odd numbers between 1..10
	public static void printOddNumbers() {
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i+=2;
		}
	}

}
