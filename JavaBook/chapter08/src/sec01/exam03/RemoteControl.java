package sec01.exam03;

public interface RemoteControl {
	// constant
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	// abstract method
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}