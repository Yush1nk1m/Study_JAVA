package sec01.exam05;

public class Outer {
	String field = "Outer.field";
	
	void method() {
		System.out.println("Outer.method()");
	}
	
	class Nested {
		String field = "Nested.field";
		
		void method() {
			System.out.println("Nested.method()");
		}
		
		void print() {
			System.out.println("this.field : " + this.field);
			System.out.print("this.method() : "); this.method();
			System.out.println("Outer.this.field : " + Outer.this.field);
			System.out.print("Outer.this.method() : "); Outer.this.method();
		}
	}
}