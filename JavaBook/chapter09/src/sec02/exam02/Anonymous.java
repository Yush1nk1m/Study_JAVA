package sec02.exam02;

public class Anonymous {
	// assign as initial value of field
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("Turn on the TV.");
		}
		@Override
		public void turnOff() {
			System.out.println("Turn off the TV.");
		}
	};
	
	void method1() {
		// assign as local variable value
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Turn on the audio.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Turn off the audio.");
			}
		};
		
		// use local variable
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}