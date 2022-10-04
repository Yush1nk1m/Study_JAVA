package sec02.exam03;

public class Button {
	OnClickListener listener;		// interface type field
	
	void setOnClickListener(OnClickListener listener) {		// polymorphism of parameter
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();		// call onClick() method of implementation object
	}
	
	static interface OnClickListener {		// nested interface
		void onClick();
	}
}