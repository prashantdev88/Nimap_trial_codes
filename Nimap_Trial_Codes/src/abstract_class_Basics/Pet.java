package abstract_class_Basics;

// Here We use abstract class to do partial abstraction the method speak() is ABSTRACT so any class implementing Interface Pet will have to implement the speak() method as well 


public abstract class Pet {


	public static void main(String[] args) {
		Pet obj = new Cat(12,"WWW");
		obj.speak();
		
		Pet obj1 = new Dog(21,"RRRRR");
		obj1.speak();
		
	}
	private int age;
	private String name;
	
	public Pet(int age ,String name) {
		this.age = age;
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	abstract void speak();
}
