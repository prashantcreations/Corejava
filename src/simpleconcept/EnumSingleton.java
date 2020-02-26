package simpleconcept;




/*
 * 
 * public enum MySingleton {
  INSTANCE;   
}

implicit implemantaion 

public enum MySingleton {
    INSTANCE;
    private MySingleton() {
        System.out.println("Here");
    }
}

 * 
 * 
 * drawback :- lazy initilization not possible
 * 
 * */




public enum EnumSingleton {
	 INSTANCE;
	private int value ;
	
	public int getValue() {
		return value ;
	}
	public void setValue(int value) {
		this.value=value;
	}
}
