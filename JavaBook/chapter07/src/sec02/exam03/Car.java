package sec02.exam03;

public class Car {
	// field
	Tire frontLeftTire = new Tire("Front Left", 6);
	Tire frontRightTire = new Tire("Front Right", 2);
	Tire backLeftTire = new Tire("Back Left", 3);
	Tire backRightTire = new Tire("Back Right", 4);
	
	// constructor
	
	// method
	int run() {
		System.out.println("[The car runs.]");
		if (frontLeftTire.roll() == false) { stop(); return 1; }
		if (frontRightTire.roll() == false) { stop(); return 2; }
		if (backLeftTire.roll() == false) { stop(); return 3; }
		if (backRightTire.roll() == false) { stop(); return 4; }
		return 0;
	}
	
	void stop() {
		System.out.println("[The car stops.]");
	}
}