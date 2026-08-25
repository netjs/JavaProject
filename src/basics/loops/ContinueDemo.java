package basics.loops;

public class ContinueDemo {
	public static void main(String[] args) {
		printOddNumbers();
		printNumbers();
	}
	
	//Print numbers from 1 to 20, but skip all even numbers using continue.
	public static void printOddNumbers() {
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 0)
				continue;
			System.out.println(i);
		}
	}
	
	//Print numbers from 1 to 30, but skip numbers divisible by 3
	public static void printNumbers() {
		for(int i = 1; i <= 30; i++) {
			if(i % 3 == 0)
				continue;
			System.out.println(i);
		}
	}
}
