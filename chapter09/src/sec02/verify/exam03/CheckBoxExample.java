package sec02.verify.exam03;

public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(
			new CheckBox.OnSelectListener() {
				public void onSelect() {
					System.out.println("Change the background.");
				}
			}
		);
		checkBox.select();
	}
}