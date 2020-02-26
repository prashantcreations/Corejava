package allcorrect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserStreamAPI6 {
	public static void main(String arg[]) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(1, "D"));
		arrayList.add(new Student(2, "A"));
		arrayList.add(new Student(3, "Z"));
		arrayList.add(new Student(4, "G"));
		
		
		List<Student> listids=arrayList.stream().filter(s1->s1.id>2).collect(Collectors.toList());
						  //.map(s1->(s1.id))
		List<Integer> listids1=arrayList.stream().filter(s1->s1.id>2)
				.map(s1->s1.id)
				.collect(Collectors.toList());		
						 
		System.out.println(listids);
		System.out.println(listids1);
		/*		
		*/		
		ArrayList l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add("A");
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(10);
		l.add(20);
		l.stream().distinct().forEach(System.out::println);
		
		
		
		/*		
		*/		Comparator<Student> comp = Comparator.comparing(Student::getId);
		Optional<Student> a =arrayList.stream().max(comp);
		System.out.println(a);
		
	}
}
