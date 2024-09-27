package sec02.verify.exam02;

public class Anonymous {
	Vehicle field = new Vehicle() {
		public void run() {
			System.out.println("A bycicle runs.");
		}
	};
	
	void method1() {
		Vehicle localVar = new Vehicle() {
			public void run() {
				System.out.println("A sedan runs.");
			}
		};
		
		localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}