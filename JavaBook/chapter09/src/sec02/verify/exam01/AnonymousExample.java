package sec02.verify.exam01;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.start();
		anony.method1();
		anony.method2(
			new Worker() {
				public void start() {
					System.out.println("Test.");
				}
			}
		);
	}
}