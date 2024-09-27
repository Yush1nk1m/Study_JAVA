package sec01.exam03;

import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		System.out.println("ArrayList takes " + (System.nanoTime() - startTime) + " ns.");
		
		startTime = System.nanoTime(); 
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		System.out.println("LinkedList takes " + (System.nanoTime() - startTime) + " ns.");
	}
}
