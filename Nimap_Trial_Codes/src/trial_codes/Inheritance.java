package trial_codes;

public class Inheritance {

	public static void main(String[] args) {
		UIController obj = new UIController();
		System.out.println(obj.status());
		obj.disable();
		System.out.println(obj.status());
		TextBox1 obj1 = new TextBox1();
		System.out.println(obj1.status());
	}
}


class UIController{
	
	private boolean isEnabled = true;
	
	public void enable() {
		isEnabled = true;
	}
	
	public void disable() {
		isEnabled = false;
	}
	
	public boolean status() {
		return isEnabled;
	}
}


class TextBox1 extends UIController{
	
}