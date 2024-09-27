package sec02.exam06;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ObjectStreamExample {
	public static void main(String[] args) throws Exception {
		writeList();
		List<Board> list = readList();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		for (Board board : list) {
			System.out.println(
					board.getBno() + "\t" + board.getTitle() + "\t" +
					board.getContent() + "\t" + board.getWriter() + "\t" +
					sdf.format(board.getDate()));
		}
	}
	
	public static void writeList() throws Exception {
		List<Board> list = new ArrayList<>();
		
		list.add(new Board(1, "Title 1", "Content 1", "Writer 1", new Date()));
		list.add(new Board(2, "Title 2", "Content 2", "Writer 2", new Date()));
		list.add(new Board(3, "Title 3", "Content 3", "Writer 3", new Date()));
		
		FileOutputStream fos = new FileOutputStream("board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}
	
	public static List<Board> readList() throws Exception {
		FileInputStream fis = new FileInputStream("board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		List<Board> list = (List<Board>) ois.readObject();
		ois.close();
		
		return list;
	}
}
