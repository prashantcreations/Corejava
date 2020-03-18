package simpleconcept;
/*
 * 1) class and data member should be final
 * 2) 
 * 
 * */

final class LikeString{
	
	private final String value ;
	
	LikeString(String value){
		this.value=value;
	}
	
	public String getValue(){
	 return value;
	}
}


public class ImmutableClass {
	public static void main(String arg[]){
		LikeString likeString = new LikeString("hello");
		System.out.println(likeString.getValue());
		
		//likeString = likeString + new LikeString("world");
		
	}
}
