package abstract_class_Basics;

public class Dog extends Pet{

	public Dog(int age, String name) {
		super(age, name);
	}

	@Override
	public void speak() {
		System.out.println("This speaks Bark "+this.getName());
		
	}

}
