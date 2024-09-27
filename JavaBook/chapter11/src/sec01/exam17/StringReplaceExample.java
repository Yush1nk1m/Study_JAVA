package sec01.exam17;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "Jxvx is an object-oriented programming language. Jxvx supports abundant APIs.";
		String newStr = oldStr.replace("Jxvx", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
