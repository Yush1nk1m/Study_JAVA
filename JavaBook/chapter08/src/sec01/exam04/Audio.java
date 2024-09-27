package sec01.exam04;

public class Audio implements RemoteControl {
	// field
	private int volume;
	
	// concrete method of abstract method turnOn()
	public void turnOn() {
		System.out.println("Turn on the audio.");
	}
	
	// concrete method of abstract method turnOff()
	public void turnOff() {
		System.out.println("Turn off the audio.");
	}
	
	// concrete method of abstract method setVolume()
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("Current audio volume : " + this.volume);
	}
}