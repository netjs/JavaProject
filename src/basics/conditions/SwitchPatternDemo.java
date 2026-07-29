package basics.conditions;

public class SwitchPatternDemo {

	public static void main(String[] args) {
		Number[] numArr = {0, 6.78, 45.7f, 90, 457758575558L, null};			
	    for(Number n: numArr) {
	      doFormattingPattern(n);
	    }
	}
	
	public static void doFormattingPattern(Number n) {
		
		switch(n) {
			case Integer i -> System.out.println("Integer as String: " + i.toString());
			case Double d -> System.out.println("Double formatted: " + String.format("%.2f", d));
			case Float f -> System.out.println("Float with suffix: " + f + "f");
			case Long l -> System.out.println("Long value: " + l.toString());
			case null -> System.out.println("Data Missing..");
			default -> System.out.println("Unknown Number type: " + n);
		}
	}

}
