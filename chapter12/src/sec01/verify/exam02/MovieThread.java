package sec01.verify.exam02;

public class MovieThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Play the video.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
