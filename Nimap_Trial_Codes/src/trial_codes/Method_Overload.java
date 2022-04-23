package trial_codes;

public class Method_Overload {

	public static void main(String[] args) {
		
		Method_Overload obj = new Method_Overload();
		System.out.println(obj.car("Red", 30));
		System.out.println(obj.car("Blue", 50,"Sedan"));
		System.out.println(obj.car("Blue", 50,"Sedan",12_00_000));
	}
	
	public String car(String color, int speed) {
		return "The car has Colour "+color+" and Has Speed "+speed+" KMPH";
	}
	
	public String car(String color, int speed,String type) {
		return "The car has Colour "+color+" and Has Speed "+speed+" KMPH the type of car is "+type;
	}
	
	public String car(String color, int speed,String type,double price) {
		return "The car has Colour "+color+" and Has Speed "+speed+" KMPH the type of car is "+type+" the price of car is $ "+price; 
	}
}
