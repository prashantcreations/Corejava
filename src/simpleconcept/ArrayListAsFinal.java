package simpleconcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class ArrayListAsFinal {
	public static void main(String[] args) {
		
		ArrayList<Object> al1 = new  ArrayList<Object>();
		ArrayList<?> al2 = new  ArrayList<>();
		//al1.add("");
		//al2.add("");
		System.out.println(al1);
		System.out.println(al2);
		
		final ArrayList al = new  ArrayList();
		al.add(10);
		al.add(10);
		al.add(30);
		al.add(30);
		al.add(30);
		
		Set s = new HashSet(al);
		System.out.println(s);
		
		al.stream().distinct().forEach(System.out::println);
		
		
		
	}
}
