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
		// if you are creating annonums so you have to 
		// implement all the methods
		StudentS s = new StudentS() {
			
			@Override
			public void getName() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void getId() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public String sumNumber(int a, int b) {
				return a+b+"";
			}
			@Override
			public void defaultCheck() {
				System.out.println("override output");
			}
			
			
		};
		System.out.println(""+s.sumNumber(10, 20));
		s.defaultCheck();
		StudentS.ceheckStatic(); // we cant call using by onject name
	}
}



