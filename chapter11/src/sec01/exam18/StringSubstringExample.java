package sec01.exam18;

public class StringSubstringExample {
	public static void main(String[] args) {
		String idxs = "0123456789";
		
		String firstNum = idxs.substring(0, 5);
		System.out.println(firstNum);
		
		String secondNum = idxs.substring(6);
		System.out.println(secondNum);
	}
}
