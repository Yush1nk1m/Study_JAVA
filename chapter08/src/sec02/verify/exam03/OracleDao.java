package sec02.verify.exam03;

public class OracleDao implements DataAccessObject {
	public void select() {
		System.out.println("[Select] in [Oracle Database]");
	}
	
	public void insert() {
		System.out.println("[Insert] in [Oracle Database]");
	}
	
	public void update() {
		System.out.println("[Update] in [Oracle Database]");
	}
	
	public void delete() {
		System.out.println("[Delete] in [Oracle Database]");
	}
}
