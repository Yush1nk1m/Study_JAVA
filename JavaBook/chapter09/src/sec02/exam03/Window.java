package sec02.exam03;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	// assign as initial value of field
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("Make a phone call.");
		}
	};
	
	Window() {
		button1.setOnClickListener(listener);	// assign field as a parameter
		button2.setOnClickListener(new Button.OnClickListener() {	// assign anonymous object as a parameter
			@Override
			public void onClick() {
				System.out.println("Send a message.");
			}
		});
	}
}