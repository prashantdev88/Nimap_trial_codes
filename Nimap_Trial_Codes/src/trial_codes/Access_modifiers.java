package trial_codes;





// PRIVATE --> can be only accessed INSIDE the class not any other class also not by CHILD class also 
// PACKAGE --> this can be accessed only inside the package not outside of the pacakge 
// PROTECTED --> This can be accessed only by the child class which is outside the package
//PUBLIC --> this modifier gives access to any class or in any pacakge


public class Access_modifiers extends Vary {

	protected String n1 = "From Protected Variable";
	public static void main(String[] args) {
		
		Vary obj = new Vary();
		obj.subName = "QQQQ";
		obj.type = "WWWW";
	}
}

class Vary{
	private String name;
	protected String subName;
	String type;
}
