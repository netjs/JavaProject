package basics.conditions;

public class SwitchGuardedDemo {

	public static void main(String[] args) {
		Object obj = "tests";
		displayMessage(obj);
		//String result  = evaluateScore(85);
		//System.out.println("Result- " + result);
	}
	
	public static void displayMessage(Object obj) {
		switch(obj) {
			
			case String s when s.length() < 5 -> System.out.println("Short String " + s);
			case String s -> System.out.println("String " + s);
			// One of these- either Object or default
			//case Object o -> System.out.println("For Object");
			default -> System.out.println("Invalid Value");
			
		}
		
	}
	
	// Using primitive type with switch pattern matching
	// still a preview feature 
	
//  public static String evaluateScore(int score) {
//	    return switch (score) {
//	      case 100 -> "Outstanding!";
//	      case int s when s >= 90 -> "Excellent: " + s;
//	      case int s when s >= 80 && s <= 89 -> "Good: " + s;
//	      case int s when s >= 50 -> "Passed: " + s;
//	      default -> "Failed with score: " + score;
//	    };
//  }

}
