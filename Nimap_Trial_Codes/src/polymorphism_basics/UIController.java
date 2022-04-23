package polymorphism_basics;

public class UIController {

	public static void main(String[] args) {
		
		UIController[] controls = {new CheckBox(),new TextBox()};
		
		for(UIController control : controls) {
			control.render();
		}
	}
	
	public void render() {
		System.out.println("This is UIControl");
	}
}
