package simpleconcept;

class Singletonclass{
	private Singletonclass(){
		
	}
	
	private static class ClassObject {
		private static final Singletonclass classObj = new Singletonclass();
		
	}
	
	public static Singletonclass getInstance() {
		return ClassObject.classObj;
	}
}

class A extends Thread{
	Singletonclass singletonClass;
	A(Singletonclass singletonClass){
		this.singletonClass= singletonClass;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("in A" +singletonClass);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class B extends Thread{
	Singletonclass singletonClass;	
	B(Singletonclass singletonClass){
		this.singletonClass=singletonClass;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("in B" +singletonClass);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class SingletonExample {
	public static void main(String arg[]){
		
		A a = new A(Singletonclass.getInstance());
		B b = new B(Singletonclass.getInstance());
		
		a.start();
		b.start();
	}
}
