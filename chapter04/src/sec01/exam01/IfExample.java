package sec01.exam01;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if (score >= 90) {
			System.out.println("score is larger than 90.");
			System.out.println("grade is A.");
		}
		
		if (score < 90)
			System.out.println("score is smaller than 90.");
			System.out.println("grade is B.");	// irrelevant with if statement
	}
}