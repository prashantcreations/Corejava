package allcorrect;

// method refrecne also can use wiht functional interfce only

public class MethodRefrences3 {
	public static void main(String arg[]) {
		Emp e1 = EmpAge::getAgeAndDateofBirth;
		e1.getAge();
		
	}
}
