package basics.operators;

public class RelationalOperatorEx {

	public static void main(String[] args) {
//		1.	Find the Largest of Three Numbers. For example,
//		Input: - int a = 25, b = 40, c = 30;
		
		int a = 0;
		int b = 3;
		int c = 5;
		int largest;
		
		if(a > b) {
			if(a > c) {
				largest = a;
			}else {
				largest = c;
			}
		}else {
			if(b > c) {
				largest = b;
			}else {
				largest = c;
			}
		}
		System.out.println("Largest number is " + largest);
		
//		2.	Check if a Number is Positive, Negative, or Zero
		
		int num = 10;
		
		if(num > 0) {
			System.out.println(num + " is a positive number");
		}else if (num < 0) {
			System.out.println(num + " is a negative number");
		}else {
			System.out.println("Number is zero");
		}
	}

}
