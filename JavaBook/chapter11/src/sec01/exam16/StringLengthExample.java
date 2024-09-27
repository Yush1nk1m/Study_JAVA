package sec01.exam16;

public class StringLengthExample {
	public static void main(String[] args) {
		String ssn = "0103063456789";
		
		int length = ssn.length();
		
		if (length == 13) {
			System.out.println("The number of digits is matched.");
		} else {
			System.out.println("The number of digits is not matched.");
		}
	}
}
