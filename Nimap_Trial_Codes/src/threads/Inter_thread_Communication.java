package threads;

public class Inter_thread_Communication {
	
	public static void main(String[] args) {
		
		Product product = new Product();
		
		Runnable producer = () ->{
			for(int i=1;i<6;i++) {
				product.produce(i);
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
			
					e.printStackTrace();
				}
			}
		};
		
		Runnable consumer = () ->{
			
			for(int j=1;j<6;j++) {
				product.consume(j);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		

		Thread pro = new Thread(producer);
		Thread con = new Thread(consumer);
		
		pro.start();
		con.start();
	}
	
}


class Product{
	
	boolean isReady;
	
	public synchronized void consume(int id) {
		
		if(isReady == false) {
			
			try{
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Product consumed with ID"+id);
		isReady = false;
		notify();
	}
	
	public synchronized void produce(int id) {
//		System.out.println(isReady+"$");
		if(isReady == true) {
			
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		
		System.out.println("Product produced with ID"+id);
		isReady = true;
		notify();
		
	}

}
