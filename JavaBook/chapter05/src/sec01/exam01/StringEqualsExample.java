package sec01.exam01;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "Yushin, Kim";
		String strVar2 = "Yushin, Kim";
		
		if (strVar1 == strVar2) {
			System.out.println("strVar1 and strVar2 have the same reference.");
		} else {
			System.out.println("strVar1 and strVar2 have different references.");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1 and strVar2 have the same string.");
		}
		
		String strVar3 = new String("Yushin, Kim");
		String strVar4 = new String("Yushin, Kim");
		
		if (strVar3 == strVar4) {
			System.out.println("strVar3 and strVar4 have the same reference.");
		} else {
			System.out.println("strVar3 and strVar4 have different references.");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3 and strVar4 have the same string.");
		}
	}
}