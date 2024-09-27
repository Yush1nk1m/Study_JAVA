package sec02.exam04;

public class PrintThread2 extends Thread {
	public void run() {
		while (true) {
			System.out.println("Running");
			if (Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("Organize resources");
		System.out.println("Terminate");
	}
}
