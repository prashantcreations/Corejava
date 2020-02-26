package allcorrect;

import java.util.function.Predicate;

public  interface PredicateClass {
	Predicate<String> stringValidation = p1->p1.length()>6;


	public static boolean checkMethod(String value,String type) {
		switch(value) {
		case "String":
			return stringValidation.test(value);
			break;
			
		default:System.out.println("default");	
		}
		
		return false;
	}
}
