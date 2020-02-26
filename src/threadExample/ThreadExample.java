package threadExample;


class A implements Runnable{
	
	@Override
	public void run() {
		System.out.println("using runnable!");
	}
}

class B extends Thread{
	
	@Override
	public void run() {
		System.out.println("using thread!");
	}
}

public class ThreadExample 
{
	public static void main(String arg[]) 
	{
		A a = new A();
		Thread thread = new Thread(a);
		thread.start();
		
		B b = new B();
		b.start();
		
	}
}



