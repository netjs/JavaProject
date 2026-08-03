package basics.operators;

/**
 * upto 5- "ok",
more than 5 and less than 10- "Notify User"
more than 10- "Warn user"
 */
public class NestedTernaryOperatorDemo {

	public static void main(String[] args) {
		int noOfTransactions = 1;
		// using nested ternary operator
		String msg = noOfTransactions <= 5 ? "ok" : 
			noOfTransactions > 5 && noOfTransactions < 10 ? "Notify User": "Warn user";
			
		System.out.println(msg);
		
		// Using if else
		if(noOfTransactions <= 5 ) {
			msg = "ok";
		}else if(noOfTransactions > 5 && noOfTransactions < 10) {
			msg = "Notify User";
		}else {
			msg = "Warn user";
		}
		System.out.println(msg);

	}

}
