package basics;

public class AllDataTypes {
	
	// Instance variable or properties 
	byte byteVariable;
	short shortVariable;
	int intVariable;
	long longVariable;
	float floatVariable;
	double doubleVariable;
	char charVariable;
	boolean booleanVariable;
	
	//Constructor
	public AllDataTypes() {
		System.out.println("Default values are ==>");
		System.out.println("default value of 'byte' is  ==>" + byteVariable);
		System.out.println("default value of 'short' is  ==>" + shortVariable);
		System.out.println("default value of 'int' is  ==>" + intVariable);
		System.out.println("default value of 'long' is  ==>" + longVariable);
		System.out.println("default value of 'float' is ==>" + floatVariable);
		System.out.println("default value of 'double' is  ==>" + doubleVariable);
		System.out.println("default value of 'char' is  ==>" + charVariable);
		System.out.println("default value of 'boolean' is ==>" + booleanVariable);
	}

	public static void main(String[] args) {
		AllDataTypes obj = new AllDataTypes();
		
		byte b = 5;
		
		int result = b + 1;
		
		short s = 3277;
		
		int i = 35374684;
		
		long l = 46474855885L;
		
		System.out.println("Value of b is " + b);
		System.out.println("Value of s is " + s);
		System.out.println("Value of i is " + i);
		System.out.println("Value of l is " + l);
		
		double f = 0.52;
		
		double r = 1 -f;
		
		double d = 78484.6768;
		
		System.out.println("Value of f is " + f);
		System.out.println("Value of d is " + d);
		System.out.println("Value of r is " + r);
		
		boolean flag = true;
		
		if(flag) {
			System.out.println("In if block");
		}
		
		char c = 'a';
		
		System.out.println("Value of c is " + c);
		
		char c1 = 66;
		
		System.out.println("Value of c1 is " + c1);
		
		String name = "Test User";
		
		System.out.println("Name is " + name);
		
		
	}

}
