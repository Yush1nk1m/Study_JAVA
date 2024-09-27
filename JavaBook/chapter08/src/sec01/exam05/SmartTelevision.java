package sec01.exam05;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	public void turnOn() {
		System.out.println("Turn on the TV.");
	}
	
	public void turnOff() {
		System.out.println("Turn off the TV.");
	}
	
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("Current TV volume : " + this.volume);
	}
	
	public void search(String url) {
		System.out.println("Search url " + url);
	}

}