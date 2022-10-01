package sec01.exam05;

public interface RemoteControl {
	// constant
		public static final int MAX_VOLUME = 10;
		public static final int MIN_VOLUME = 0;
		
	// method
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
}
