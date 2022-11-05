package sec01.verify.exam07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	List<Board> list = new ArrayList<Board>();
	
	public List<Board> getBoardList() {
		list.add(new Board("title1", "content1"));
		list.add(new Board("title2", "content2"));
		list.add(new Board("title3", "content3"));
		
		return list;
	}
}
