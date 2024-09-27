package sec01.exam11;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];	// array that stores read bytes
		
		System.out.print("Enter : ");
		int readByteNo = System.in.read(bytes);		// store read bytes on the array and return the number of read bytes
		
		String str = new String(bytes, 0, readByteNo - 2);
		System.out.println(str);
	}
}
