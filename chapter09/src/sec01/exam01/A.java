package sec01.exam01;

/* Outer class */
public class A {
	A() { System.out.println("A object has been created."); }
	
	/* instance member class */
	class B {
		B() { System.out.println("B object has been created."); }
		int field1;
		//static int field2;
		void method1() {}
		//static void method2() {}
	}
	
	/* static member class */
	static class C {
		C() { System.out.println("C object has been created."); }
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		/* local class */
		class D {
			D() { System.out.println("D object has been created."); }
			int field1;
			//static int field2;
			void method1() {}
			//static void method2() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}