package sec02.exam01;

import java.util.*;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		System.out.println("100Won inserted into coinBox.");
		coinBox.push(new Coin(50));
		System.out.println("50Won inserted into coinBox.");
		coinBox.push(new Coin(500));
		System.out.println("500Won inserted into coinBox.");
		coinBox.push(new Coin(10));
		System.out.println("10Won inserted into coinBox.");
		
		System.out.println();
		
		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("A coin taken out : " + coin.getValue() + "Won");
		}
	}
}
