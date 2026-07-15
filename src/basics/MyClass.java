package basics;

public class MyClass {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		Calculator calculator = new Calculator();
		double sum = obj.doAddition(6.8, 13.4);
		
		System.out.println("Sum is " + sum);
		obj.displayGreeting();
		
		double num = calculator.multiplication(8, 10.5);
		System.out.println("Product is " + num);
		
		num = calculator.subtraction(15, 6);
		System.out.println("Subtraction is " + num);
		
		num = calculator.division(15, 6);
		System.out.println("Division is " + num);

	}
	
	public double doAddition(double i, double j) {
		double sum = i + j;
		return sum;
	}
	
	public void displayGreeting() {
		String name = getName();
		System.out.println("Hello " + name);
	}
	
	private String getName() {
		return "Ram";
	}

}
