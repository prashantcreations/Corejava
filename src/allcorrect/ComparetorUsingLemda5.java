package allcorrect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.print.attribute.standard.Compression;



public class ComparetorUsingLemda5 {
	public static void main(String arg[]) {
		List<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(1, "D"));
		arrayList.add(new Student(2, "A"));
		arrayList.add(new Student(3, "Z"));
		arrayList.add(new Student(4, "G"));
		
		Collections.sort(arrayList,(s1,s2)->{
			return s1.name.compareTo(s2.name);
		});
		arrayList.forEach(s1->System.out.println(s1.id+" "+s1.name));
		
		Emp e1=()->{
			System.out.println("get age using lemda function");
		};		
		
	}
}
