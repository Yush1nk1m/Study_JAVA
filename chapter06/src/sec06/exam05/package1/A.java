package sec06.exam05.package1;

public class A {
	// field
	public int field1;
	int field2;
	private int field3;
	
	// constructor
	public A() {
		field1 = 1;		// (O)
		field2 = 1;		// (O)
		field3 = 1;		// (O)
		
		method1();		// (O)
		method2();		// (O)
		method3();		// (O)
	}
	
	// method
	public void method1() { }		// public access modifier
	void method2() { }				// default access modifier
	private void method3() { }		// private access modifier
}