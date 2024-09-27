package sec02.exam02;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;		// Auto type casting
		parent.method1();
		parent.method2();			// Override method is called
		//parent.method3();			// Unable to call
	}
}