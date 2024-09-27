package sec02.verify.exam05;

public class Exam05 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int n = 0;
		for (int[] e1 : array) {
			n += e1.length;
			for (int e2 : e1) {
				sum += e2;
			}
		}
		avg = sum / (double)n;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}