import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentExample {
	public static void main(String arg[]) {
		
		ArrayList<Integer> al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println(al);
		Iterator it = al.iterator();
		while(it.hasNext()) {
			it.next();
			it.remove();
		}
		System.out.println(al);
		/*
		 * for(Integer i:al) { al.remove(new Integer(2)); //al.remove(2); }
		 */
	}

}
