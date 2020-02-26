package simpleconcept;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingleton {
	public static void main(String arg[]) {
		Singletonclass singletonclass = Singletonclass.getInstance();
		System.out.println("first object :- "+singletonclass);
		Singletonclass singletonclass2 = null;
		try {
			Constructor constructor[] = Singletonclass.class.getDeclaredConstructors();
			for(Constructor constructorValue : constructor) {
				constructorValue.setAccessible(true);
				try {
					singletonclass2= (Singletonclass)constructorValue.newInstance();
				} catch (InstantiationException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
				
			}
		}catch(IllegalAccessException  ex) {
			ex.printStackTrace();
		}
		System.out.println("second object:- "+singletonclass2);		
	}
}
