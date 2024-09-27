package sec02.verify.exam02;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "src/sec02/verify/exam02/AddLineNumberExample.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int lineNumber = 1;
		while (true) {
			String code = br.readLine();
			if (code == null) break;
			System.out.println(lineNumber + ": " + code);
			lineNumber++;
		}
		
		br.close();
	}
}
