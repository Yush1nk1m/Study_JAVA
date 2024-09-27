package sec02.verify.exam03;

public class MySqlDao implements DataAccessObject {
	public void select() {
		System.out.println("[Select] in [MySql Database]");
	}
	
	public void insert() {
		System.out.println("[Insert] in [MySql Database]");
	}
	
	public void update() {
		System.out.println("[Update] in [MySql Database]");
	}
	
	public void delete() {
		System.out.println("[Delete] in [MySql Database]");
	}
}