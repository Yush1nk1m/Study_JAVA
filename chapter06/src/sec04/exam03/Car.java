package sec04.exam03;

public class Car {
	// field
	int gas;
	
	// constructor
	
	// method
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("There's no gas lefted.");
			return false;
		}
		System.out.println("There's gas lefted.");
		return true;
	}
	
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("run. (remaining gas : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("stop. (remaining gas : " + gas + ")");
				return;
			}
		}
	}
}