package basics.operators;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		int result = getValue(15);
		System.out.println("Result= " + result);
		
		String msg = voteOrNot(12);
		System.out.println("Message is: " + msg);
	}
	
	/**
	 * If passed value is greater than 10 multiply it by 5, otherwise multiply it by 10
	 */
	public static int getValue(int i) {
		int val = i > 10 ? i * 5 : i * 10;
		
		// Equivalent if/else statement
		if( i > 10 ) {
			val = i * 5;
		}else {
			val = i * 10;
		}
		return val;
	}
	
	/**
	 * If passed age is greater than or equal to 18 message is "You can vote!"
	 * Otherwise it is "You can't vote!"
	 */
	public static String voteOrNot(int age) {
		String message = age >= 18 ? "You can vote!" : "You can't vote!";
		return message;
	}
}
