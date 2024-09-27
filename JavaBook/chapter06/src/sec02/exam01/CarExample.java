package sec02.exam01;

public class CarExample {
	public static void main(String[] args) {
		// create object
		Car myCar = new Car();
		
		// read field value
		System.out.println("manufacturer : " + myCar.company);
		System.out.println("model name : " + myCar.model);
		System.out.println("color : " + myCar.color);
		System.out.println("the highest speed : " + myCar.maxSpeed);
		System.out.println("current speed : " + myCar.speed);
		
		// change field value
		myCar.speed = 60;
		System.out.println("modified speed : " + myCar.speed);
	}
}