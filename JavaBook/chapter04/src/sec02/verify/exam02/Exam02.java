package sec02.verify.exam02;

public class Exam02 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("sum of multiple of 3 : " + sum);
	}
}