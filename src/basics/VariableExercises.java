package basics;

public class VariableExercises {

	public static void main(String[] args) {
//		1.	Write a program, where you declare and initialize 4 variables and calculate the 
//		average of those 4 variables.
		
		double a = 20;
		double b = 7;
		double c = 9;
		double d = 15;
		
		double average = (a + b + c + d)/4;
		
		System.out.println("Average is " + average);
		
//		3.	Temperature Conversion (Celsius - Fahrenheit)
		
		double celsius = 36.5;
		
		double fahrenheit = (celsius * 9/5) + 32;
		
		System.out.println("Temperature in celsisus = " + celsius + " in Fahrenheit = " + fahrenheit);
		
//		4.	Write a java program to swap values of two variables with use of third variable.
		
		int x = 9;
		int y = 12;
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);
		int temp = x; // 9
		
		x = y; //12
		y = temp; //9
		
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);
		
//		5.	Swap or Exchange Two Numbers Without Using Any Temporary Variable.
		
		int p = 8;
		int q = 17;
		System.out.println("p= " + p);
		System.out.println("q= " + q);
		//8 + 17 = 25
		
		//25 - 17 = 8
		
		//25 - 8 = 17
		
		p = p + q; // 25
		
		q = p - q; // 8
		
		p = p - q; // 17
		
		System.out.println("p= " + p);
		System.out.println("q= " + q);
	}

}
