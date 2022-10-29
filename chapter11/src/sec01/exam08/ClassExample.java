package sec01.exam08;

public class ClassExample {
	public static void main(String[] args) throws Exception {
		// first approach
		Class clazz = Car.class;
		
		// second approach
		//Class clazz = Class.forName("sec01.exam08.Car");
		
		// third approach
		//Car car = new Car();
		//Class clazz = car.getClas();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}
	
	public class Car { }
}
