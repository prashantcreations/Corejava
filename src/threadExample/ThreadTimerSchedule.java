package threadExample;

import java.util.Timer;
import java.util.TimerTask;

/*
 * timetask call by timer 
 * */


class ThreadTimerClass extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("in run method");
	}
	
}

public class ThreadTimerSchedule {
	public static void main(String arg[]) {
		TimerTask timertask = new ThreadTimerClass();
		Timer time = new Timer();
		time.scheduleAtFixedRate(timertask, 0, 10000);
	}
}
