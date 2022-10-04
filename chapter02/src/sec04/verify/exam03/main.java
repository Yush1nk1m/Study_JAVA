package sec04.verify.exam03;

import java.util.Scanner;

public class main {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("name : ");
		String name = scanner.nextLine();
		
		System.out.print("id (former 6 letters) : ");
		String id = scanner.nextLine();
		
		System.out.print("tel : ");
		String tel = scanner.nextLine();
		
		System.out.println("[input data]");
		System.out.println(name);
		System.out.println(id);
		System.out.println(tel);
	}
}