package sec01.exam13;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("YUSHIN, KIM");
		String strVar2 = "YUSHIN, KIM";
		
		if (strVar1 == strVar2) {
			System.out.println("Reference the same String object.");
		} else {
			System.out.println("Reference different String objects.");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("Have the same String.");
		} else {
			System.out.println("Have different Strings.");
		}
		
	}
}
