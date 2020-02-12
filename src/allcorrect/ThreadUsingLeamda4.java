package allcorrect;

import java.util.Timer;
import java.util.TimerTask;

public class ThreadUsingLeamda4 {
	
	public static void main(String arg[]) {
		
		Runnable runnable =()->{
			System.out.println("Thread is running");
		};
		Thread thread = new Thread(runnable);
		thread.run();
	}
}
