package sec03.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("Gildong, Hong");
		
		smartPhone.turnOn();			// method of 'Phone'
		smartPhone.internetSearch();	// method of 'Phone'
		smartPhone.turnOff();			// method of 'Phone'
	}
}