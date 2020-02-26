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
	void sample();
}

interface User2
{
	default void pancardNumber() {
		System.out.println("in user1");
	}
	void sample();
}
interface SumValue
{
	default void pancardNumber() {
		System.out.println("in user2");
	}
	void sample();
}

class AllUser implements User1,User2{

	
	
	 @Override public void pancardNumber() {
	 System.out.println("which user method is calling"); }
	 
	@Override
	public void sample() {
		// TODO Auto-generated method stub
		System.out.println("call");
	}
	 
	
}


public class InterfaceExample 
{
	public static void main(String arg[]) {
		
		AllUser allUser = new AllUser();
		allUser.pancardNumber();
	}
}
