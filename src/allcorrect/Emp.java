package allcorrect;


// he we can use @functionalinterface annotation if you want to ristrict
interface Emp{
	
	 void getAge();
	 
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
			return "age 32 and dade of birth is 12 12 1999";
		}
	}