package allcorrect;



public class AnnonusClass1 {
	public static void main(String arg[]) {
		//without annonus class
		Emp emp = new EmpImpl();
		emp.getAge();
		
		// with annonmus class 
		Emp emp1 = new Emp() {
			@Override
			public void getAge() {
				System.out.println("get emp age using annonums class");
			}
		};
		emp1.getAge();
	}
}



