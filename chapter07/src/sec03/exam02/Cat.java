package sec03.exam02;

public class Cat extends Animal {
	public Cat() {
		this.kind = "mammals";
	}
	
	@Override
	public void sound() {
		System.out.println("Meow");
	}
}