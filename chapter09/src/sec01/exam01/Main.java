package sec01.exam01;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		
		// create an object of instance member class
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		// create an object of static member class
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		// call the method for creating an object of local class
		a.method();
	}
}