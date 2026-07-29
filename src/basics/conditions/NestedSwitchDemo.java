package basics.conditions;

public class NestedSwitchDemo {

	public static void main(String[] args) {
		String department = "ECE";
        int year = 3;

        switch (department) {
            case "IT":
                System.out.println("Department: Information Technology");
                switch (year) {
                    case 1: 
                    	System.out.println("Subjects: Programming Basics, Digital Logic");
                    	break;
                    case 2: 
                    	System.out.println("Subjects: Data Structures, Computer Networks");
                    	break;
                    case 3:
                    	System.out.println("Subjects: Operating Systems, Database Management");
                    	break;
                    case 4:
                    	System.out.println("Subjects: Cloud Computing, AI Fundamentals");
                    	break;
                    default: 
                    	System.out.println("Invalid year!");
                }
                break;
            case "ECE":
                System.out.println("Department: Electronics & Communication");
                switch (year) {
                    case 1:
                    	System.out.println("Subjects: Circuit Theory, Signals");
                    	break;
                    case 2:
                    	System.out.println("Subjects: Microprocessors, Communication Systems");
                    	break;
                    case 3:
                    	System.out.println("Subjects: VLSI Design, Embedded Systems");
                    	break;
                    case 4:
                    	System.out.println("Subjects: Wireless Networks, Robotics");
                    	break;
                    default: 
                    	System.out.println("Invalid year!");
                }
                break;
            default: System.out.println("Invalid department!");
        }

	}


}
