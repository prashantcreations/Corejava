package simpleconcept;


//imp mink 

//https://www.techiedelight.com/difference-between-string-stringbuilder-java/

public class StringTest 
{
	public static void main(String arg[]) {
		
		String a1 = new String("Pandu");
		String a2 = new String("Pandu");
		
		System.out.println("  "+a1==a2);
		
		// its true for string becuase string class override the equals method 
		System.out.println("  "+a1.equals(a2));
		
		
		StringBuilder a3 = new StringBuilder("Pandu");
		StringBuilder a4 = new StringBuilder("Pandu");
		
		System.out.println(a3==a4);
		// its true for string becuase string class override the equals method 
		// but builder and buffer not implements the equals method 
		System.out.println("  "+a3.equals(a4));
		
		
		
	}

}
