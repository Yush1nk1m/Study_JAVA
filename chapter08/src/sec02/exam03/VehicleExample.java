package sec02.exam03;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare();		// (x) There's no method named checkFare() in Vehicle interface
		
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;	// Casting
			
			bus.run();
			bus.checkFare();		// There's checkFare() method in the class Bus
		}
	}
}