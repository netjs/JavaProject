package basics;

public class SimpleInterest {

	public static void main(String[] args) {
		int principal = 5000;
		double rateOfInterest = 7.5;
		int duration = 5;
		
		double simpleInterest;
		
		simpleInterest = (principal * rateOfInterest * duration)/100;
		
		System.out.println("Simple Interest = " + simpleInterest);

	}

}
