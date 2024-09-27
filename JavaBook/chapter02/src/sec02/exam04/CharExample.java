package sec02.exam04;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';			// directly assign character
		char c2 = 65;			// assign as decimal
		char c3 = '\u0041';		// assign as hexadecimal
		
		char c4 = '가';			// directly assign character
		char c5 = 44032;		// assign as decimal
		char c6 = '\uac00';		// assign as hexadecimal
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	}
}