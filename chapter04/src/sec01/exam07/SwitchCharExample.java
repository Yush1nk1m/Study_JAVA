package sec01.exam07;

public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch (grade) {
			case 'A':
			case 'a':
				System.out.println("VIP Member");
				break;
			case 'B':
			case 'b':
				System.out.println("Normal Member");
				break;
			default:
				System.out.println("Guest");
		}
	}
}