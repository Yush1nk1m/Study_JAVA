package sec01.exam25;

public class ValueCompareExample {
	public static void main(String[] args) {
		System.out.println("[The case when the value is exceeded range of -128 ~ 127]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		System.out.println("Result of '==' operation : " + (obj1 == obj2));
		System.out.println("Result of '==' operation after unboxing : " + (obj1.intValue() == obj2.intValue()));
		System.out.println("Result of equals() method : " + obj1.equals(obj2));
		System.out.println();
		
		System.out.println("[The case when the value is between range of -128 ~ 127]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		
		System.out.println("Result of '==' operation : " + (obj3 == obj4));
		System.out.println("Result of '==' operation after unboxing : " + (obj3.intValue() == obj4.intValue()));
		System.out.println("Result of equals() method : " + obj3.equals(obj4));
	}
}
