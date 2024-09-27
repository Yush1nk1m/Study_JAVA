package sec01.exam07;

public class SystemTimeExample {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		int sum = 0;
		for (int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		
		System.out.println("Sum from 1 to 1000000 : " + sum);
		System.out.println("It took " + (System.nanoTime() - time1) + " nanoseconds.");
	}
}
