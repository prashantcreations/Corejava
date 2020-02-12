package allcorrect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UserStreamAPI6 {
	public static void main(String arg[]) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(1, "D"));
		arrayList.add(new Student(2, "A"));
		arrayList.add(new Student(3, "Z"));
		arrayList.add(new Student(4, "G"));
		
		
		List<Integer> listids=arrayList.stream().filter(s1->s1.id>2)
						  .map(s1->(s1.id))
						  .collect(Collectors.toList());
		
		System.out.println(listids);
		
		Set<Integer> set=arrayList.stream().filter(s1->s1.id>2)
				  .map(s1->(s1.id))
				  .collect(Collectors.toList());
		
	}
}
