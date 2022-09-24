package sec02.verify.exam06;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("1. the number of student | 2. score | 3. score list | 4. analysis | 5. exit");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.print("SELECT : ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if (selectNo == 1) {
				System.out.print("the number of student > ");
				int n = Integer.parseInt(scanner.nextLine());
				scores = new int[n];
			} else if (selectNo == 2) {
				int n = scores.length;
				for (int i = 0; i < n; i++) {
					System.out.print("scores[" + i + "] > ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if (selectNo == 3) {
				int n = scores.length;
				for (int i = 0; i < n; i++)
					System.out.println("scores[" + i + "] > " + scores[i]);
			} else if (selectNo == 4) {
				int max = 0, n = scores.length;
				double avg = 0.0;
				for (int e : scores) {
					if (e > max) max = e;
					avg += (double) e / n;
				}
				System.out.println("The highest score : " + max);
				System.out.println("Average score : " + avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("end the program");
	}
}