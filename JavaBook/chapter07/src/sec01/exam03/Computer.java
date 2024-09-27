package sec01.exam03;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Run areaCircle() of Computer object.");
		return Math.PI * r * r;
	}
}