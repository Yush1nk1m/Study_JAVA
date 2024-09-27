package sec01.exam23;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		// Auto boxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());
		
		// Auto boxing when it is assigned
		int value = obj;
		System.out.println("value : " + value);
		
		// Auto boxing when it is operated
		int result = obj + 100;
		System.out.println("result : " + result);
	}
}
