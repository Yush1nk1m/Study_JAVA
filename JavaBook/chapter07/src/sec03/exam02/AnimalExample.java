package sec03.exam02;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		// promotion of variable
		Animal animal = null;
		
		animal = new Dog();		// promotion
		animal.sound();			// call override method
		
		animal = new Cat();		// promotion
		animal.sound();			// call override method
		System.out.println("-----");
		
		// polymorphism of method
		animalSound(new Dog());		// promotion
		animalSound(new Cat());		// promotion
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();			// call override method
	}
}