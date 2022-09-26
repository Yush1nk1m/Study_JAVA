package sec06.exam05.package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;		// (O)
		a.field2 = 1;		// (O)
		//a.field3 = 1;		// (X) private field
		
		a.method1();		// (O)
		a.method2();		// (O)
		//a.method3();		// (X) private method
	}
}