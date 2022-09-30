package sec02.exam03;

public class Tire {
	// field
	public int maxRotation;			// Maximum rotation (Life of tire)
	public int accumulatedRotation;	// Accumulated rotation
	public String location;			// Location of tire
	
	// constructor
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// method
	public boolean roll() {
		++accumulatedRotation;		// increase accumulated rotation 1
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire's life : " + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("*** " + location + " Tire has been flat. ***");
			return false;
		}
	}
}