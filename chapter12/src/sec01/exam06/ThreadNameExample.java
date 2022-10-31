package sec01.exam06;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("Name of Program start thread : " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("Name of Task thread : " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("Name of Task thread : " + threadB.getName());
		threadB.start();
	}
}
