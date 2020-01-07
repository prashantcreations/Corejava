import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Emp {

	private int id;
	private String name;

	
	  public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override public int hashCode() {
		  System.out.println("df  "+id);
		  System.out.println("ddf "+this.id);
		  
		  return id-this.id;
	 }
	  
	  @Override public boolean equals(Object obj) { 
		  Emp nextEmp = (Emp)obj;
		  if(nextEmp.getName().equals(this.getName())) {
			  return false;
		  }
		  return true;
	  }
	  
	  @Override
	public String toString() {
		return id + " " + name;
	}

}

// init size 16 and growth ratio is size*.75
// find the index using size%value exp 16%3 =1
// null always at zero index
public class MapClass {
	/* if we ll try to add same key it will orerride it */
	public static void main(String arg[]) {

		// how map workes on object

		Emp emp = new Emp();
		emp.setId(1);
		emp.setName("Prashant");
		
		Emp emp1 = new Emp();
		emp1.setId(2);
		emp1.setName("Pandu");

		Map empMap = new HashMap();
		empMap.put(emp, emp.getName());
		empMap.put(emp1, emp1.getName());

		System.out.println(empMap);

		/*
		 * Map map = new HashMap(); map.put(1, "A"); map.put(2, "B"); map.put(3, null);
		 * map.put(null, null); map.put(null, null); System.out.println(map);
		 * 
		 * Map map1 = new LinkedHashMap(); map1.put(1, "A"); map1.put(2, "B");
		 * System.out.println(map1);
		 * 
		 * Map<Integer,String> map2 = new TreeMap<Integer,String>(); map2.put(1, "A");
		 * map2.put(2, "B"); System.out.println(map2);
		 * 
		 * //get value from map
		 * 
		 * for(Map.Entry entry:map2.entrySet()) { System.out.println(entry.getKey()
		 * +" "+entry.getValue()); }
		 */	}

}
