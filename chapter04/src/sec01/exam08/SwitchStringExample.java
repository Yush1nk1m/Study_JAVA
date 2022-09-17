package sec01.exam08;

public class SwitchStringExample {
	public static void main(String[] args) {
		String position = "section chief";
		
		switch (position) {
			case "Manager":
				System.out.println("7 million won");
				break;
			case "section chief":
				System.out.println("5 million won");
				break;
			default:
				System.out.println("3 million won");
		}
	}
}