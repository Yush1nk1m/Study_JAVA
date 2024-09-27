package sec02.verify.exam03;

public class MovieThread extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("Play the video.");
			if (Thread.interrupted()) {
				break;
			}
		}
	}
}
