package sec01.exam02;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "hours " + minute + "minutes");
		
		int totalMinute = (hour * 60) + minute;
		System.out.println("total " + totalMinute + "minutes");
	}
}