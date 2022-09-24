package sec01.exam01;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("variable s1 references Student object.");
		
		Student s2 = new Student();
		System.out.println("variable s2 references another Student object.");
	}
}