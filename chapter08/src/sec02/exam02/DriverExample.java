package sec02.exam02;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);		// promotion : Vehicle vehicle = bus;
		driver.drive(taxi);		// promotion : Vehicle vehicle = taxi;
	}
}