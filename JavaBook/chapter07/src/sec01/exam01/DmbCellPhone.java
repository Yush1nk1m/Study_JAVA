package sec01.exam01;

public class DmbCellPhone extends CellPhone {
	// field
	int channel;
	
	// constructor
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	// method
	void turnOnDmb() {
		System.out.println("Start to receive channel " + channel + " DMB broadcast.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("Change the channel into channel " + channel);
	}
	void turnOffDmb() {
		System.out.println("Stop receiving DMB broadcasting.");
	}
}