package sec01.verify.exam08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "Gildong, Hong"));
		set.add(new Student(2, "Yushin, Kim"));
		set.add(new Student(1, "Yushin, Kim"));
		
		Iterator<Student> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + " : " + student.name);
		}
	}
}