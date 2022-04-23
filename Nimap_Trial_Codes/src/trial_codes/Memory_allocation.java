package trial_codes;

public class Memory_allocation {

	public static void main(String[] args) {
		var text = new TextBox();
		text.setText("Tiger");
		var text2 = text;
		System.out.println(text2);
		text.setText("Shark");
		System.out.println(text2);
		// When the main metod stops executing then the temperoary variables will be deleted
		
	}
}


class TextBox{

	String text;
	public void setText(String text) {
		
		this.text = text;
	}
	
	@Override
	public String toString() {
		return text;
	}
}