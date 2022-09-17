package sec01.exam04;

public class IfDiceExample {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1;
		
		if (num == 1) {
			System.out.println("number 1 came out.");
		} else if (num == 2) {
			System.out.println("number 2 came out.");
		} else if (num == 3) {
			System.out.println("number 3 came out.");
		} else if (num == 4) {
			System.out.println("number 4 came out.");
		} else if (num == 5) {
			System.out.println("number 5 came out.");
		} else {
			System.out.println("number 6 came out.");
		}
	}
}