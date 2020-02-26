package allcorrect;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicatesExample8 {
	
	public static void main(String arg[]) {
		
		Predicate<String> p = p1->p1.length()>6;
		
		
		ArrayList<String> al = new ArrayList<>();
		al.add("prasdhant");
		al.add("mahesh");
		al.add("pandu");
		
		//al.forEach(list->System.out.println(p.test(list))); // test will call the predicate and return the result
		
		//class form
		al.forEach(list->System.out.println(PredicateClass.checkMethod(list,"String")));//p.test(list))); // test will call the predicate and return the result
		
	}
}
