package simpleconcept;

class T{
	int a ;
}


class T2 implements Cloneable{
	int b=10;
	T t = new T();
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
}


class BB{
	int a ;
}


class B2 implements Cloneable{
	int b=10;
	BB b1 = new BB();
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		B2 b2= (B2)super.clone();
		b2.b1= new BB();
		return b2;
	}
	
	
	
}


public class CloneExample {
	
	public static void main(String arg[]) throws CloneNotSupportedException {
		
		
		//shallow copy
		T2 t1 = new T2();
		t1.t.a=10;

		System.out.println("before clone :"+ t1.t.a);
		
		T2 t2clone = (T2)t1.clone();
		t2clone.t.a=30;

		System.out.println("after clone simple obj :"+ t1.t.a);
		System.out.println("after clone clone obj  "+t2clone.t.a);
		
		B2 b = new B2();
		b.b1.a = 400;
		System.out.println("before clone "+b.b1.a);
		
		B2 bclone =(B2)b.clone();
		bclone.b1.a = 1000;
		System.out.println("after clone simple obj "+b.b1.a);
		System.out.println("after clone clone obj  "+bclone.b1.a);
		
		
		
	}
}
