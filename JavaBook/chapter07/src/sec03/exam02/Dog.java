package sec03.exam02;

public class Dog extends Animal {
	public Dog() {
		this.kind = "mammals";
	}
	
	@Override
	public void sound() {
		System.out.println("Bow-wow");
	}
}