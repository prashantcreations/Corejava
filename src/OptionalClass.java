import java.util.Optional;

public class OptionalClass 
{
	public static void main(String arg[]) 
	{
		/*
		 * String[] str = new String[5]; 
		 * System.out.println(str[2].toLowerCase());
		 */
		
		//above code throw th null pointer exception to handel this we use operational class 
		String[] str = new String[5]; 
		Optional<String> optional = Optional.ofNullable(str[5]);
		if(optional.isPresent()) {
			System.out.println(str[2].toLowerCase());
		}
		
	}
}
