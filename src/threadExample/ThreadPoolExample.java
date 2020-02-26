package threadExample;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Worker implements Runnable{
	
	String threadId;
	
	Worker(String threadId){
		this.threadId=threadId;
	}

	@Override
	public void run() {
		System.out.println("Start :- "+Thread.currentThread().getName()+" "+threadId);
		doWork();
		System.out.println("End :- "+Thread.currentThread().getName()+" "+threadId);
	}

	private void doWork() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


public class ThreadPoolExample {
	public static void main(String arg[]) {
		
		ExecutorService executerService = Executors.newFixedThreadPool(10);
		for(int i=0 ; i<10; i++) {
			Runnable worker = new Worker(" "+i); 
			executerService.execute(worker);
		}
		executerService.isShutdown();
		
		 while(!executerService.isTerminated()) {
		 
		 }
		 
		System.out.println("finish all thread!");
	}
}
