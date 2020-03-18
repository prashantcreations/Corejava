package threadExample;


class Ajoin extends Thread{
	@Override
	public void run(){
		for(int i=0 ; i<100 ; i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
}



public class Useofjoin {
	public static void main(String[] args) throws InterruptedException {
		Ajoin ajoin = new Ajoin();
		ajoin.setName("Yogesh");
		
		Ajoin ajoin2 = new Ajoin();
		ajoin2.setName("Mahesh");
		
		ajoin.start();
		//here thread will get con
		
		ajoin.join(1);
		
		ajoin2.start();
		
		

		
		
	}
}
