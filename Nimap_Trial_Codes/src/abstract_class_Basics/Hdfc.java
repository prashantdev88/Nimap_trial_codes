package abstract_class_Basics;

// Here we use Interface Bank to achieve full abstraction the method getIntrestRate() getType() are created in Interface Bank and then Implemented in any class needed 



public class Hdfc implements Bank{

	@Override
	public double getIntrestRate() {
		return 6.75;
	}
	
	@Override
	public void getType() {
		System.out.println("The is private Bank");
	}

	
}
