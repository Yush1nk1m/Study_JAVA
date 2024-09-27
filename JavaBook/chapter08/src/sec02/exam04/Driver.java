package sec02.exam04;

public class Driver {
	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) {	// Examine if the parameter vehicle references Bus object
			Bus bus = (Bus) vehicle;	// If it's true, safely do casting
			bus.checkFare();			// The reason why we do casting into Bus type 
		}
		vehicle.run();
	}
}