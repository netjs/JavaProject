package basics.conditions;

public class IfElseDemo {

	public static void main(String[] args) {
		int age = 15;
		voteOrnot(age);

	}
	
	public static void voteOrnot(int age) {
		if(age >= 18) {
			System.out.println("You can vote");
		}else {
			System.out.println("You can't vote");
		}
	}

}
