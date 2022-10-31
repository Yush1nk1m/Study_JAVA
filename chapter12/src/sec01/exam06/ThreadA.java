package sec01.exam06;

public class ThreadA extends Thread {
	public ThreadA() {
		setName("ThreadA");
	}
	
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("Contents printed by " + getName());
		}
	}
}
