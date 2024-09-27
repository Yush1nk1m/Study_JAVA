package sec02.verify.exam01;

public class Anonymous {
	Worker field = new Worker() {
		public void start() {
			System.out.println("Design.");
		}
	};
	
	void method1() {
		Worker localVar = new Worker() {
			public void start() {
				System.out.println("Develope.");
			}
		};
		
		localVar.start();
	}
	
	void method2(Worker worker) {
		worker.start();
	}
}