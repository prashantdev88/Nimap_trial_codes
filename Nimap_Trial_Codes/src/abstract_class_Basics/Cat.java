package abstract_class_Basics;

public class Cat extends Pet{

	public Cat(int age, String name) {
		super(age, name);

	}

	@Override
	public void speak() {
		System.out.println("It speaks Meow"+this.getName());
	}

}
