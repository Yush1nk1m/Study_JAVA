package sec04.verify.exam03;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if (result) {
			System.out.println("logined.");
			memberService.logout("hong");
		} else {
			System.out.println("id or password is not correct.");
		}
	}
}