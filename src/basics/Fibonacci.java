package basics;

public class Fibonacci {

	public static void main(String[] args) {
		int num = 15;
		Fibonacci obj = new Fibonacci();
		obj.fibonacciIterative(num);
		System.out.println();
		System.out.println("Recursive Output");
		for(int i = 0; i < num; i++) {
			System.out.print(fibonacciRecursive(i) + " ");
		}
		
	}
	
	// Iterative method
	public void fibonacciIterative(int num){
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		for(int i = 0; i < num; i++) {
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;
			num3 = num1 + num2;
		}
	}
	
	// Recursive approach
	public static int fibonacciRecursive(int num){
		//base case
		if(num <= 1) {
			return num;
		}
		return fibonacciRecursive(num-1) + fibonacciRecursive(num-2);
	}

}
