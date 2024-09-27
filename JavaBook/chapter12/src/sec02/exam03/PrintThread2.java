package sec02.exam03;

public class PrintThread2 extends Thread {
	public void run() {
		try {
			while (true) {
				System.out.println("Running");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {}
		
		System.out.println("Organize resources");
		System.out.println("Terminate");
	}
}
