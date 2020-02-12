// at least one method have to declear in functionm interface
// if we are using functional interfce annotation then java take take care means check there must bne only one 
// abstract method not more than that

//lemda function is make easy to implemantation of function interface 

@FunctionalInterface
interface Car{
	void getDetails();
}


public class FunctionalInterfaceExample {
	
	public static void main(String arg[]) {
		Car car =()->{
			System.out.println("me wihtout argument");
		};
		car.getDetails();
	}
	
	Runnable runnable =()->{
		System.out.println("thred is running");
	};
	
}
