package sec01.verify.exam03;

import java.util.HashMap;

public class StudentExample {
	public static void main(String[] args) {
		// generate HashMap object which stores total score with Student key
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		// Store score "95" on new Student("1")
		hashMap.put(new Student("1"), "95");
		
		// read score using new Student("1")
		String score = hashMap.get(new Student("1"));
		System.out.println("Total score of student 1 : " + score);
	}
}
