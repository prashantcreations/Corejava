import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;  



/*
 * reduce ?
 * map and for each differance 
 * 
 * 
 * */
public class StreamAPI 
{  
    public static void main(String[] args) 
    {
    	
    	/*this ues to itrate the stream
    	 * 
    	 * stream not store the element just conveys the element.
    	 * */
    	
    	//M1
    	//streamAPIExample();
    	
    	/*stream iterator */
    	
    	//M2
    	//streamIterator();
    	
    	//M3
    	//sum
    	//sumPrize();
    	
    	//M4
    	//find min max
    	//findMinMax();
    	
    	// conever into map a list 
    	convetListToMap();
    	
    }

	private static void convetListToMap() {
	    List<Product> productsList = new ArrayList<Product>();  
	    //Adding Products  
	    productsList.add(new Product(1,"HP Laptop",25000f));  
	    productsList.add(new Product(2,"Dell Laptop",30000f));  
	    productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	    productsList.add(new Product(4,"Sony Laptop",28000f));  
	    productsList.add(new Product(5,"Apple Laptop",90000f));  
	    
	    Map product = productsList.stream()
	    		.collect(Collectors.toMap(p->p.id, p->p.name));
	    
	    System.out.println(product);
	    
	    // same for min 
	    
	}

	private static void findMinMax() {
	    List<Product> productsList = new ArrayList<Product>();  
	    //Adding Products  
	    productsList.add(new Product(1,"HP Laptop",25000f));  
	    productsList.add(new Product(2,"Dell Laptop",30000f));  
	    productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	    productsList.add(new Product(4,"Sony Laptop",28000f));  
	    productsList.add(new Product(5,"Apple Laptop",90000f));  
	    
	    Product product = productsList.stream()
	    		.max((product1,product2)->
	    		product1.price>product2.price?1:-1).get();
	    
	    System.out.println(product.price);
	    
	    // same for min 
	    
	}

	private static void sumPrize() {
	    List<Product> productsList = new ArrayList<Product>();  
	    //Adding Products  
	    productsList.add(new Product(1,"HP Laptop",25000f));  
	    productsList.add(new Product(2,"Dell Laptop",30000f));  
	    productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	    productsList.add(new Product(4,"Sony Laptop",28000f));  
	    productsList.add(new Product(5,"Apple Laptop",90000f));  
	    
	    double sumofPrize = productsList.stream()
		         .collect(Collectors.summingDouble(product->product.price));
	    
	    System.out.println(sumofPrize);
	    
	}

	private static void streamIterator() {
		// can iterate any number of times 
		// 10 is inital element 
		Stream.iterate(10,element->element+1)
		.filter(element->element%5==0)
		.limit(5).
		forEach(System.out::println);
	}

	private static void streamAPIExample() {
	    List<Product> productsList = new ArrayList<Product>();  
	    //Adding Products  
	    productsList.add(new Product(1,"HP Laptop",25000f));  
	    productsList.add(new Product(2,"Dell Laptop",30000f));  
	    productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	    productsList.add(new Product(4,"Sony Laptop",28000f));  
	    productsList.add(new Product(5,"Apple Laptop",90000f));  
	    
	    List<Float> prizeList = productsList.stream()
	    						.filter(p->p.price>300)
	    						.map(t->t.price)
	    						.collect(Collectors.toList());
	    			// we can conenet it in toSet,toMap
	    
	    
	    System.out.println(prizeList);
	}  
} 


class Product
{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) 
    {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}


