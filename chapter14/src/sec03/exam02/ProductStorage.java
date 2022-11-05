package sec03.exam02;

import java.util.*;

public class ProductStorage {
	private List<Product> list = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	private int counter;
	
	public void showMenu() {
		while (true) {
			System.out.println("------------------------------------");
			System.out.println("1. register | 2. catalogue | 3. exit");
			System.out.println("------------------------------------");
			
			System.out.print("Select : ");
			String selectNo = scanner.nextLine();
			
			switch (selectNo) {
				case "1" :
					registerProduct(); break;
				case "2" :
					showProducts(); break;
				case "3" :
					return;
			}
		}
	}
	
	public void registerProduct() {
		try {
			Product product = new Product();
			product.setPno(++counter);
			
			System.out.print("Product name : ");
			product.setName(scanner.nextLine());
			
			System.out.print("Price : ");
			product.setPrice(Integer.parseInt(scanner.nextLine()));
			
			System.out.print("Stock : ");
			product.setStock(Integer.parseInt(scanner.nextLine()));
			
			list.add(product);
		} catch (Exception e) {
			System.out.println("Registration error : " + e.getMessage());
		}
	}
	
	public void showProducts() {
		for (Product p : list) {
			System.out.println(p.getPno() + "\t" + p.getName() + "\t" +
			p.getPrice() + "\t" + p.getStock());
		}
	}
}
