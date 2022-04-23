package collections;

// While in compile Time the Super class method is pointed out to but in Runtime the Child class method is only reffered so it is called Dynamic method dispatch
// but it is not same with the variable only super class variable is preffred in all the context

public class Dynamic_methodDispatch {

	public static void main(String[] args) {
		
		A a = new A();
		A b = new B();
		A c = new C();
		c.m1();
		A a1 = new B();
		a1.m1();
		System.out.println(a1.a);
		System.out.println(c.a);
	}
}

class A {
	int a = 10;
	void m1() {
		System.out.println("Inside Class A");
	}
}


class B extends A {

	int a = 100;
	@Override
	void m1() {
		System.out.println("Inside Class B");
	}
}


class C extends A {
	int a = 1000;
	@Override
	void m1() {
		System.out.println("Inside Class C");
	}
}