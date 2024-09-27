package sec04.exam03;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);	// call setGas() method of Car
		
		boolean gasState = myCar.isLeftGas();	// call isLeftGas() method of Car
		if (gasState) {
			System.out.println("start.");
			myCar.run();
		}
		
		if (myCar.isLeftGas()) {	// call isLeftGas() method of Car
			System.out.println("No need for charging gas.");
		} else {
			System.out.println("Charge gas.");
		}
	}
}