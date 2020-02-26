package allcorrect;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExceptionInFilter {
	public static void main(String arg[]) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(1, "D"));
		arrayList.add(new Student(2, "A"));
		arrayList.add(new Student(3, "Z"));
		arrayList.add(new Student(4, "G"));
		
		
		List<Integer> listids=arrayList.stream().filter(s1->s1.id>2)
						  .map(s1->(s1.id))
						  .collect(Collectors.toList());
		
		ArrayList<EmpT> arrayList1 = new ArrayList<EmpT>();
		arrayList1.add(new EmpT("10"));
		arrayList1.add(new EmpT("20"));
		arrayList1.add(new EmpT("40D"));
		arrayList1.add(new EmpT("30"));
		
		List<EmpT> listids1=arrayList1.stream().filter(
					s1->{
						try {
							return Integer.parseInt(s1.age) > 10;
							}catch(NumberFormatException e) {
								 //e.printStackTrace();
								 return false;
							}
					}
				)
				 	//.map(s1->(s1.age))
				  .collect(Collectors.toList());
		
		System.out.println(listids1);
	}
}
