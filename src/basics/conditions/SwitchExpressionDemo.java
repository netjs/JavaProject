package basics.conditions;

public class SwitchExpressionDemo {

	public static void main(String[] args) {
		int month = 5;  
		switch(month){
			case 1,2,3 -> System.out.println("Quarter 1");
			case 4,5,6 -> System.out.println("Quarter 2");
			case 7,8,9 -> System.out.println("Quarter 3");
			case 10,11,12 -> System.out.println("Quarter 4");
			default -> System.out.println("Invalid month");
		}

	}

}
