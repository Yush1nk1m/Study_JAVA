package sec02.exam05;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();				// InterfaceA instance only can call methodA()
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();				// InterfaceB instance only can call methodB()
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();				// InterfaceC instance can call methodA(), methodB(), methodC()
	}
}