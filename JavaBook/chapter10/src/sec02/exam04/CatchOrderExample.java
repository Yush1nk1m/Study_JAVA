package sec02.exam04;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The number of runtime argument is not enough.");
		} catch(Exception e) {
			System.out.println("There is some other problem at running the program.");
		} finally {
			System.out.println("Run the program again.");
		}
	}
}
