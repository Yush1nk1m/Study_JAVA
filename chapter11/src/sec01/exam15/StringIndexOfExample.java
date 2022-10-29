package sec01.exam15;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "JAVA Programming";
		
		int location = subject.indexOf("Programming");
		System.out.println(location);
		
		if (subject.indexOf("JAVA") != -1) {
			System.out.println("This book is related with java.");
		} else {
			System.out.println("This book is not related with java.");
		}
	}
}
