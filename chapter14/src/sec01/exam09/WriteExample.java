package sec01.exam09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("test9.txt");
		
		char[] array = { 'A', 'B', 'C', 'D', 'E', 'F' };
		
		writer.write(array, 1, 3);
		
		writer.flush();
		writer.close();
	}
}
