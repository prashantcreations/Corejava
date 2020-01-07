package simpleconcept;
/*
 * if only decalre the method in interface and implemating so there is no issue 
 * 
 * but if 
 * 
 * */

interface User1
{
	default void pancardNumber() {
		System.out.println("in user1");
	}
}
interface User2
{
	default void pancardNumber() {
		System.out.println("in user2");
	}
}

class AllUser implements User1,User2{

	
	 @Override public void pancardNumber() {
	 System.out.println("which user method is calling"); }
	 
	
}


public class InterfaceExample 
{
	public static void main(String arg[]) {
		
		AllUser allUser = new AllUser();
		allUser.pancardNumber();
	}
}
