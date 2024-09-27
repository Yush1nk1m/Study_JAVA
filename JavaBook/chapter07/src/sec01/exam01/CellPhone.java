package sec01.exam01;

public class CellPhone {
	// field
	String model;
	String color;
	
	// constructor
	
	// method
	void powerOn() { System.out.println("Power ON."); }
	void powerOff() { System.out.println("Power OFF."); }
	void bell() { System.out.println("Bell rings."); }
	void sendVoice(String message) { System.out.println("Me : " + message); }
	void receiveVoice(String message) { System.out.println("The other : " + message); }
	void hangUp() { System.out.println("Hang up the call."); }
}