package sec02.exam01;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		// use anonymous object field
		anony.field.wake();
		
		// use anonymous object local variable
		anony.method1();
		
		// use anonymous object parameter
		anony.method2(
			new Person() {
				void study() {
					System.out.println("Study.");
				}
				@Override
				void wake() {
					System.out.println("Wake up in 8 morning.");
					study();
				}
			}
		);
	}
}