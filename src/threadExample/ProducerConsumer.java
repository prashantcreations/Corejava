package threadExample;


class Product{

	 static int qty_product;
	
	synchronized void consume(){
		if(qty_product<1) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			qty_product--;
		}
		System.out.println("consume :- "+qty_product);
		notifyAll();
	}
	
	synchronized void produce() {
		
		if(qty_product>=5) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			qty_product++;
		}
		System.out.println("produce :- "+qty_product);
		notifyAll();
	}
	
}

class Producer extends Thread{
	
	Product product ;
	Producer(Product product) {
		this.product = product;
	}
	
	@Override
	public void run() {
		while(true)
		product.produce();
	}
	
}

class Consumer extends Thread{
	Product product; 
	public Consumer(Product product) {
		this.product = product;
	}
	
	@Override
	public void run() {
		while(true)
		product.consume();
	}
	
}

public class ProducerConsumer {
	public static void main(String arg[]) 
	{
		Product product= new Product();
		Consumer consumer = new Consumer(product);
		Producer producer = new Producer(product);
		
		consumer.start();
		producer.start();
		
	}
}
