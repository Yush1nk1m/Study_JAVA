package sec02.exam01;

public class Anonymous {
	// assign as a initial value of field
	Person field = new Person() {
		void work() {
			System.out.println("Go to work.");
		}
		@Override
		void wake() {
			System.out.println("Wake up in 6 morning.");
			work();
		}
	};
	
	void method1() {
		// assign as a local variable value
		Person localVar = new Person() {
			void walk() {
				System.out.println("Walk.");
			}
			@Override
			void wake() {
				System.out.println("Wake up in 7 morning.");
				walk();
			}
		};
		// use local variable
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}