package basics.conditions;

public class IfElseIfDemo {
	//A: 90-100%, B: 80-89%, C: 70-79%, D: 60-69%, F: Below 60%
	public static void main(String[] args) {
		int percentage = 95;
		char grade = calculateGrade(percentage);
		System.out.println("Percentage is " + percentage + " Grade is- " + grade);

	}
	
	public static char calculateGrade(int percentage) {
		char grade;
		// validation
		if(percentage > 100 || percentage < 0) {
			System.out.println("Invalid value");
			return 'X';
		}
		// if else-if ladder
		if(percentage >= 90 && percentage <= 100) {
			grade = 'A';
		}else if(percentage >= 80 && percentage <= 89) {
			grade = 'B';
		}
		else if(percentage >= 70 && percentage <= 79) {
			grade = 'C';
		}
		else if(percentage >= 60 && percentage <= 69) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		return grade;
	}

}
