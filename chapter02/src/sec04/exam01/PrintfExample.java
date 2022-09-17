package sec04.exam01;

public class PrintfExample {
	public static void main(String[] args) {
		int value = 123;
		System.out.printf("price of item : %d won\n", value);
		System.out.printf("price of item : %6d won\n", value);
		System.out.printf("price of item : %-6d won\n", value);
		System.out.printf("price of item : %06d won\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("area of circle (r = %d) : %10.2f\n", 10, area);
		
		String name = "gil-dong, Hong";
		String job = "thief";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}
}