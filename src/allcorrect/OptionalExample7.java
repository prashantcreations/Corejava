package allcorrect;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalExample7 {
	public static void main(String arg[]) {
		
		ArrayList al = new ArrayList();
		Optional<ArrayList> l = Optional.of(al);
		System.out.println(l.get().size());
		System.out.println(l.isPresent());
		
	}
}
