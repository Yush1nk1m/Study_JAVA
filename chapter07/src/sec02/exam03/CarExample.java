package sec02.exam03;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("Change Front Left into HankookTire");
				car.frontLeftTire = new HankookTire("Front Left", 15);
				break;
				
			case 2:
				System.out.println("Change Front Right into KumhoTire");
				car.frontRightTire = new KumhoTire("Front Right", 13);
				break;
				
			case 3:
				System.out.println("Change Back Left into HankookTire");
				car.backLeftTire = new HankookTire("Back Left", 14);
				break;
				
			case 4:
				System.out.println("Change Back Right into KumhoTire");
				car.backRightTire = new KumhoTire("Back Right", 17);
				break;
			}
			System.out.println("------------------------------");
		}
	}
}