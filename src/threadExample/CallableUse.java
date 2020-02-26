package threadExample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class UseCallable implements Callable<Long>{
	
	private int value;
	UseCallable(int value){
		this.value=value;
	}

	@Override
	public Long call() throws Exception {
		System.out.println(value);
		Long l = getData(value);
		return l ;
	}
	
	public long getData(int value) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 10*value;
	}
}


public class CallableUse {
	public static void main(String[] args) throws InterruptedException, ExecutionException{
		
		ExecutorService es = Executors.newSingleThreadExecutor();
		System.out.println("first start");
		Future f1= es.submit(new UseCallable(1));
		System.out.println("first end ");
		
		System.out.println("second start");
		es.submit(new UseCallable(2));
		System.out.println("second end");
		
		System.out.println("third start");
		es.submit(new UseCallable(3));
		System.out.println("third end");
		
		System.out.println("four start");
		es.submit(new UseCallable(4));
		System.out.println("four end");
		
		long ff1= (long) f1.get();		
		System.out.println(ff1);
		long ff2= (long) f1.get();		
		System.out.println(ff2);
		
		long ff3= (long) f1.get();		
		System.out.println(ff3);
		
		long ff4= (long) f1.get();		
		System.out.println(ff4);
		
		
		
		
	}
}
