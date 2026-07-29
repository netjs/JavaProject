package basics.conditions;

/** 
 * Traditional way to apply the appropriate formatting or conversion logic.
 * Using the if/else if ladder and instanceof
 */
public class FormatTraditional {
	public static void main(String[] args) {
		Number[] numArr = {5, 6.78, 45.7f, 90, 457758575558L, null};			
	    for(Number n: numArr) {
	      doFormattingTraditional(n);
	    }
	}
	
	public static void doFormattingTraditional(Number n) {
	    //null check
	    if(n != null) {
	      if (n instanceof Integer i) {
	        System.out.println("Integer as String: " + i.toString());
	      } else if (n instanceof Double d) {
	        System.out.println("Double formatted: " + String.format("%.2f", d));
	      } else if (n instanceof Float f) {
	        System.out.println("Float with suffix: " + f + "f");
	      } else if (n instanceof Long l) {
	        System.out.println("Long value: " + l.toString());
	      } else {
	        System.out.println("Unknown Number type: " + n);
	      }
	    }
	}
}
