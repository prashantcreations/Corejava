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
	
	

	/*
	 * public int hashCode() { System.out.println("df  " + id);
	 * System.out.println("ddf " + getId());
	 * 
	 * return getId() - this.id; }
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/*
	 * @Override public boolean equals(Object obj) { Emp nextEmp = (Emp) obj; if
	 * (nextEmp.getName().equals(this.getName())) { return false; } return true; }
	 */
	@Override
	public String toString() {
		return id + " " + name;
	}

}

// init size 16 and growth ratio is size*.75
// find the index using size%value exp 16%3(key) =1
// null always at zero index
public class MapClass {
	/* if we ll try to add same key it will orerride it */
	public static void main(String arg[]) {

		// how map workes on object
		sampleMap() ;
		//useobject();

	}
	
	
	static void useobject() {
		Emp emp = new Emp();
		emp.setId(1);
		emp.setName("Prashant");

		Emp emp1 = new Emp();
		emp1.setId(2);
		emp1.setName("Pandu");

		Map empMap = new HashMap();
		empMap.put(emp, emp.getName());
		empMap.put(emp1, emp1.getName());
		//empMap.get(emp1);

		System.out.println("=== "+empMap.size());
	}

	static void sampleMap() {
		Map map = new HashMap();
		// null always at top becuase hascode of null is zero
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, null);
		map.put(null, null);
		map.put(null, null);
		System.out.println(map);

		Map map1 = new LinkedHashMap();
		map1.put(1, "A");
		map1.put(2, "B");
		System.out.println(map1);
		
		

		Map<Integer, String> map2 = new TreeMap<Integer, String>();
		map2.put(1, "A");
		map2.put(2, "B");
		System.out.println(map2);

		// get value from map

		for (Map.Entry entry : map2.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
