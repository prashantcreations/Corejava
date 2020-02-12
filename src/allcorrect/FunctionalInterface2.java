package allcorrect;



public class FunctionalInterface2 {
	
	public static void main(String arg[]) {
		
		Emp e1=()->{
			System.out.println("get age using lemda function");
		};
		e1.getAge();
	}
}
