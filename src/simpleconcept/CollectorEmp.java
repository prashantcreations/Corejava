package simpleconcept;

class Ce{
	
	public  void show(Object o) {
		System.out.println("in obj=  "+o);
	}
	public  void show(Number a) {
		System.out.println("in Number "+a);
	}
}

public class CollectorEmp {
	public static void main(String arg[]) {
		Ce e = new Ce();
		e.show(null);
	}
	
}
