package sec01.exam01;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		// create DmbCellPhone object
		DmbCellPhone dmbCellPhone = new DmbCellPhone("Java Phone", "Black", 10);
		
		// inherited fields from CellPhone class
		System.out.println("Model : " + dmbCellPhone.model);
		System.out.println("Color : " + dmbCellPhone.color);
		
		// DmbCellPhone class's field
		System.out.println("Channel : " + dmbCellPhone.channel);
		
		// call method inherited from class CellPhone
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("Hello.");
		dmbCellPhone.receiveVoice("Hello! I'm gildong, hong.");
		dmbCellPhone.sendVoice("Ah~ nice to meet you.");
		dmbCellPhone.hangUp();
		
		// call method of DmbCellPhone
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}