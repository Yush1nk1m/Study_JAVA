package sec03.exam03;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
		File dir = new File("src/sec03/exam03/images");
		File file1 = new File("src/sec03/exam03/file1.txt");
		File file2 = new File("src/sec03/exam03/file2.txt");
		File file3 = new File("src/sec03/exam03/file3.txt");
		
		if (dir.exists() == false) { dir.mkdirs(); }
		if (file1.exists() == false) { file1.createNewFile(); }
		if (file2.exists() == false) { file2.createNewFile(); }
		if (file3.exists() == false) { file3.createNewFile(); }
		
		File temp = new File("src/sec03/exam03");
		File[] contents = temp.listFiles();
		
		System.out.println("Time\t\t\tForm\t\tSize\tName");
		System.out.println("--------------------------------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		
		for (File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			
			if (file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
	}
}
