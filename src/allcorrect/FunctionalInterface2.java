package allcorrect;

import java.io.ObjectInputStream.GetField;

public class FunctionalInterface2 {
	
	public static void main(String arg[]) {
		
		Emp e1=()->{
			System.out.println("get age using lemda function");
		};
		e1.getAge();
		e1.defaultCheck();
		Emp.staticCheak();//here we cant call static mathod using obj we have to use class
		
		SumTwoNumber sum=(a1,a2)->{
			
			return a1+a2;
		};
		System.out.println(sum.SumNumber(10,20));
	}
}
