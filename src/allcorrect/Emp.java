package allcorrect;


// he we can use @functionalinterface annotation if you want to ristrict
@FunctionalInterface
interface Emp{
	
	 void getAge();
	 
	 default void defaultCheck() {
		 System.out.println("in defaultcheck");
	 }
	 
	 static void staticCheak() {
		 System.out.println("in staticcheck");
	 }
}

interface StudentS{
	void getName();
	void getId();
	String sumNumber(int a , int b);
	default void defaultCheck() {
		System.out.println("Hey! I am default method");
	}
	
	static void ceheckStatic() {
		System.out.println("static check");
	}
	
}

interface SumTwoNumber{
	int SumNumber(int a1,int a2) ;
}

	class EmpImpl implements Emp{

		@Override
		public void getAge() {
			// TODO Auto-generated method stub
			System.out.println("get all empage");
		}
	}
	
	class EmpAge{
		public static String getAgeAndDateofBirth() {
			return "age 11 and dade of birth is 12 12 1999";
		}
	}