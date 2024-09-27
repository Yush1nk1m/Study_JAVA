package sec03.verify.exam03;

public class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	Board(String title, String content) {
		this(title, content, "logined member id", "current computer date", 0);
	}
	
	Board(String title, String content, String writer) {
		this(title, content, writer, "current computer date", 0);
	}
	
	Board(String title, String content, String writer, String date) {
		this(title, content, writer, date, 0);
	}
	
	Board(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}
}