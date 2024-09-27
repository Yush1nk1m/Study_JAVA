package sec01.exam05;

import java.util.*;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("Gildong, Hong", 30));
		set.add(new Member("Gildong, Hong", 30));
		
		System.out.println("Total number of objects : " + set.size());
	}
}
