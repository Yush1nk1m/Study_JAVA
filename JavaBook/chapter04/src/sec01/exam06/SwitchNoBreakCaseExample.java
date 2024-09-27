package sec01.exam06;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[time now : " + time + " o'clock]");
		
		switch (time) {
			case 8:
				System.out.println("go to work.");
			case 9:
				System.out.println("attend to meeting.");
			case 10:
				System.out.println("do work.");
			default:
				System.out.println("work outside.");
		}
	}
}