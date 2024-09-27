package sec02.exam02;

public class PrintThread1 extends Thread {
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		while (!stop) {
			System.out.println("Running.");
		}
		System.out.println("Organizing Resources.");
		System.out.println("Terminate.");
	}
}
