package sec04.verify.exam03;

public class MemberService {
	boolean login(String id, String password) {
		if (id.equals("hong") & password.equals("12345"))
			return true;
		return false;
	}
	
	void logout(String id) {
		System.out.println("[ID : " + id + "] has been logout.");
	}
}