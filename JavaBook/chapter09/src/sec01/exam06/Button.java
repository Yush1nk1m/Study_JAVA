package sec01.exam06;

public class Button {
	OnClickListener listener;		// interface type field
	
	void setOnClickListener(OnClickListener listener) {		// polymorphism of the parameter
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();			// call onClick() method of implementation object
	}
	
	static interface OnClickListener {		// nested interface
		abstract void onClick();
	}
}