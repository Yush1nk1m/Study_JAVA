package sec02.verify.exam06;

public class Exam06 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			int j;
			for (j = 1; j <= 4 - i; j++)
				System.out.print(" ");
			for (; j <= 4; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}