
class T extends Thread{
	@Override
	public void run() {
		System.out.println("in there");
	}
}

class P implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("in runnable");
	}
	
}

public class ThreadClass {
	public static void main(String arg[]) {
		T t = new T();
		t.start();
		P p = new P();
		Thread thred = new Thread(p);
		thred.start();
		
	}
}
