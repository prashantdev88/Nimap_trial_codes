package trial_codes;

public class Static_variable_method {

	public static void main(String[] args) {
		Bike obj = new Bike("AAAA");
		Bike obj1 = new Bike("TTTT");
		Bike obj2 = new Bike("QQQQ");
		Bike obj3 = new Bike("SSS");
		Bike.printCount();
	}
}


class Bike{
	private String name;
	private static int count;
	
	public Bike(String name) {
		this.name = name;
		count++;
	}
	
	public static void printCount() {
		System.out.println("The count of Bikes "+count);
	}
}