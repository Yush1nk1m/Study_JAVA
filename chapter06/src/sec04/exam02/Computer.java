package sec04.exam02;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		int l = values.length; // optimization
		for (int i = 0; i < l; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		int l = values.length;	// optimization
		for (int i = 0; i < l; i++) {
			sum += values[i];
		}
		return sum;
	}
}