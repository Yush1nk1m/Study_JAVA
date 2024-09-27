package sec01.exam06;

public class CallListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("Make a phone call.");
	}
}