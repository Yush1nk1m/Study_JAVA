package sec01.exam02;

public class IfElseExample {
	public static void main(String[] args) {
		int score = 85;
		
		if (score >= 90) {
			System.out.println("score is larger than 90.");
			System.out.println("grade is A.");
		} else {
			System.out.println("score is smaller than 90.");
			System.out.println("grade is B.");
		}
	}
}