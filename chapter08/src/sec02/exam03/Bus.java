package sec02.exam03;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("The bus runs.");
	}
	
	public void checkFare() {
		System.out.println("Check the fare.");
	}
}