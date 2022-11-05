package sec02.verify.exam04;

public class MovieThread extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("Play the video.");
			try { Thread.sleep(1000); } catch (InterruptedException e) {}
		}
	}
}
