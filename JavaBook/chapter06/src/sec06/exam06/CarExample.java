package sec06.exam06;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		// wrong speed modifying
		myCar.setSpeed(-50);
		
		System.out.println("current speed : " + myCar.getSpeed());
		
		// right speed modifying
		myCar.setSpeed(60);
		
		// stop
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("current speed : " + myCar.getSpeed());
	}
}