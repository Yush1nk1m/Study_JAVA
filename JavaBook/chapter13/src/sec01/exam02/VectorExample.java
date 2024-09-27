package sec01.exam02;

import java.util.*;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("Title 1", "Content 1", "Writer 1"));
		list.add(new Board("Title 2", "Content 2", "Writer 2"));
		list.add(new Board("Title 3", "Content 3", "Writer 3"));
		list.add(new Board("Title 4", "Content 4", "Writer 4"));
		list.add(new Board("Title 5", "Content 5", "Writer 5"));
		
		list.remove(2);
		list.remove(3);
		
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}
}
