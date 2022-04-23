package threads;

public class Runnable_thread {
	
	public static void main(String[] args) {
		
		Mythread obj = new Mythread();
		obj.run();
		Mythread1 obj1 = new Mythread1();
		obj1.start();
	}
}


class Mythread implements Runnable{

	@Override
	public void run() {
		System.out.println("This thread is Runnable THREAD");
		
	}
	
}

class Mythread1 extends Thread{
	
	public void run() {
		System.out.println("This is THREAD class Thread");
	}
}