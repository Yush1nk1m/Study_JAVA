package sec02.prac09;

import java.util.Scanner;

public class main {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String strnum1, strnum2;
		
		System.out.print("first number : ");
		strnum1 = scanner.nextLine();
		
		System.out.print("second number : ");
		strnum2 = scanner.nextLine();
		
		double num1 = Double.parseDouble(strnum1), num2 = Double.parseDouble(strnum2);
		
		System.out.println("--------------------");
		if (num2 == 0)
			System.out.println("result : infinite");
		else
			System.out.printf("result : %.2f", (num1 / num2));
	}
}