import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass 
{
	public static void main(String ard[]) {
		/*
		 * every key generate hascode for key so its out put always unpredicable
		 * */
		
		Set set = new HashSet();
		set.add(11);
		set.add(9);
		set.add(20);
		set.add(null);
		System.out.println(set);
		
		/* insetion order .. it use linklist */
		
		Set set1 = new LinkedHashSet();
		set1.add(11);
		set1.add(9);
		set1.add(20);
		set1.add(null);
		System.out.println(set1);
		
		
		/*sorted order null not allowed because of sorting   */
		Set set2 = new TreeSet();
		set2.add(11);
		set2.add(9);
		set2.add(11);
		set2.add(100);
		set2.add(50);
		set2.add(75);
		set2.add(9);
		set2.add(6);
		System.out.println(set2);
		
		/*
		 * HashMap hashMap = new HashMap<Integer, String>(); hashMap.put(1,"A");
		 * hashMap.put(null,"A");
		 * 
		 * System.out.println(hashMap);
		 */
	}
}
