package sec01.verify.exam02;

public class MusicRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Play the music.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
