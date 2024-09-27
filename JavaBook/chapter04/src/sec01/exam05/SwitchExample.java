package sec01.exam05;

public class SwitchExample {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1;
		
		switch (num) {
			case 1:
				System.out.println("number 1 came out.");
				break;
			case 2:
				System.out.println("number 2 came out.");
				break;
			case 3:
				System.out.println("number 3 came out.");
				break;
			case 4:
				System.out.println("number 4 came out.");
				break;
			case 5:
				System.out.println("number 5 came out.");
				break;
			default:
				System.out.println("number 6 came out.");
				break;
		}
	}
}