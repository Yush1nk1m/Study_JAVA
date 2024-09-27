package sec06.exam05.package2;

import sec06.exam05.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;		// (O)
		//a.field2 = 1;		// (X) default field
		//a.field3 = 1;		// (X) private field
		
		a.method1();		// (O)
		//a.method2();		// (X) default method
		//a.method3();		// (X) private method
	}
}