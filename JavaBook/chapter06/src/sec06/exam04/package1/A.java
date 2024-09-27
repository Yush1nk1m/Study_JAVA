package sec06.exam04.package1;

public class A {
	// field
	A a1 = new A(true);		// (O)
	A a2 = new A(1);		// (O)
	A a3 = new A("String");	// (O)
	
	// constructor
	public A(boolean b) { }
	A(int b) { }
	private A(String s) { }
}