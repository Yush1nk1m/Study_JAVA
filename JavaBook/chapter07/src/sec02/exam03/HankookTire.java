package sec02.exam03;

public class HankookTire extends Tire {
	// field
	
	// constructor
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire life : " + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire has been flat ***");
			return false;
		}
	}
}
