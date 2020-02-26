package simpleconcept;

public class SingletonEnumMainclass {
	public static void main(String arg[]) {
		EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
		System.out.println(enumSingleton);
		enumSingleton.setValue(10);
		System.out.println(enumSingleton.getValue());
		
		EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
		System.out.println(enumSingleton1);
		
		enumSingleton1.setValue(20);
		System.out.println(enumSingleton.getValue());
		
	}
}
