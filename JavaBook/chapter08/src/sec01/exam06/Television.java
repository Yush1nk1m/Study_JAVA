package sec01.exam06;

public class Television implements RemoteControl {
	public int volume;
	
	public void turnOn() {
		System.out.println("Turn on the TV.");
	}
	
	public void turnOff() {
		System.out.println("Turn off the TV.");
	}
	
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
			System.out.println("You can set volumes up to 10.");
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
			System.out.println("You can set volumes up to 0.");
		} else {
			this.volume = volume;
		}
		System.out.println("Current TV volume : " + this.volume);
	}
}