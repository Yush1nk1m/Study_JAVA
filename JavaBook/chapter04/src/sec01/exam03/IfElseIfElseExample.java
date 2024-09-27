package sec01.exam03;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 75;
		
		if (score >= 90) {
			System.out.println("score is between 90 and 100.");
			System.out.println("grade is A.");
		} else if (score >= 80) {
			System.out.println("score is between 80 and 89.");
			System.out.println("grade is B.");
		} else if (score >= 70) {
			System.out.println("score is between 70 and 79.");
			System.out.println("grade is C.");
		} else {
			System.out.println("score is under 70.");
			System.out.println("grade is D.");
		}
	}
}