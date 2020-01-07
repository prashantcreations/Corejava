
// it works for functional interfce only 
// so it ll work only static context because interface method by default public static 

interface Bike
{
	void getDetails();
	
}

interface Bicyle{
	void bicycleDetails();

}

class Vechical{
	public static void  carIsVechical() {
		System.out.println("bike is also a vechical");
	}
}

public class MethodRefrences {
	public static void main(String arg[]) {
		Bike bike = Vechical::carIsVechical;
		bike.getDetails();
	}
}
