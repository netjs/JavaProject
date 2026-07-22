package basics.conditions;

/*
 * Prevailing interest rate is 6.5% annually
 * if age is between 60 and 75 then add 0.5% to the interest rate
 * if age is 75 or greater than that then add 1% to the interest rate
 * otherwise person gets the prevailing interest rate
 */
public class NestedIfDemo {

	public static void main(String[] args) {
		double rateOfInterest = 6.5;
		int age = 48;
		double a = Math.PI * age;
		calculateRateOfInterest(rateOfInterest, age);

	}
	
	public static void calculateRateOfInterest(double roi, int age) {
		if(age >= 60) {
			if(age >= 75) {
				roi = roi + 1;
			}else {
				roi = roi + .5;
			}
		}
		System.out.println("Rate of interest is " + roi);
	}

}
