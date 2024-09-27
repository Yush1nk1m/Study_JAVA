package sec02.exam02;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		// use anonymous object field
		anony.field.turnOn();
		
		// use anonymous object local variable
		anony.method1();
		
		// use anonymous object parameter
		anony.method2(
			new RemoteControl() {
				@Override
				public void turnOn() {
					System.out.println("Turn on SmartTV.");
				}
				
				@Override
				public void turnOff() {
					System.out.println("Turn off SmartTV.");
				}
			}
		);
	}
}