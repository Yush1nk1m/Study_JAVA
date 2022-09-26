package sec04.exam06;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalcu = new Calculator();
		
		// find the area of square
		double result1 = myCalcu.areaRectangle(10);
		
		// find the area of rectangle
		double result2 = myCalcu.areaRectangle(10, 20);
		
		// print result
		System.out.println("Area of square = " + result1);
		System.out.println("Area of rectangle = " + result2);
	}
}