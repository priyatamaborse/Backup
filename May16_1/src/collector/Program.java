package collector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.management.ImmutableDescriptor;

class Product{  
    int id;  
    String name;  
    float price;  
      
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}  
    
	
    
}  
public class Program 
{

	public static void main(String[] args) 
	{
		List<Product> productsList = new ArrayList<Product>();  
		
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));
        //toList
        List<Float> priceList=productsList.stream().map(x->x.getPrice()).collect(Collectors.toList());
        System.out.println(priceList);
        //toSet
        Set<Float> priceSet=productsList.stream().map(x->x.getPrice()).collect(Collectors.toSet());
        System.out.println(priceSet);
        
        //toCollection
        Collection<Product> name=productsList.stream().collect(Collectors.toCollection(LinkedList::new));
        System.out.println("collection "+name);
        //summingInt
        Integer sumId=productsList.stream().collect(Collectors.summingInt(x->x.id));
        System.out.println("Sum Of Id: "+sumId);
        //averagingDouble
        Double avgPrice=productsList.stream().collect(Collectors.averagingDouble(x->x.price));
        System.out.println("Avg price :"+avgPrice);
        //counting
        Long totalProduct=productsList.stream().collect(Collectors.counting());
        System.out.println("Total :"+totalProduct);
        
        //partitioningBy
        Map<Boolean, List<Product>> IdGreaterTwo=productsList.stream().collect(Collectors.partitioningBy(x->x.id>2));
        System.out.println(IdGreaterTwo);
       
        //partitioningBy for counting
        Map<Boolean,Long> count=productsList.stream().collect(Collectors.partitioningBy(x->x.id>2, Collectors.counting()));
       System.out.println("count -----"+count);
       
       
       //toMap(1 param)
       //below code throw illegal state exception because of duplicate key
       //Map<Character, String> map= productsList.stream().collect(Collectors.toMap(x->x.name.charAt(1), x->x.name));
       //System.out.println("Map  :"+map);
       
     //toMap(2 param)
       //to avoid above exception put third parameter to form unique key
       Map<Character, String> map= productsList.stream().collect(Collectors.toMap(x->x.name.charAt(1), x->x.name,(x,y)->x+","+y));
       System.out.println("Map  :"+map);
       
     //toMap(3 param)
       LinkedHashMap<Character, String> linkedHashMap= productsList.stream().collect(Collectors.toMap(x->x.name.charAt(1), x->x.name,(x,y)->x+","+y ,LinkedHashMap::new));
       System.out.println("Map  :"+linkedHashMap);
       
       //joining
       String allNameLaptop = productsList.stream().map(x->x.name).collect(Collectors.joining());
       System.out.println(allNameLaptop);
       
       //joining
       String allNameLaptop1 = productsList.stream().map(x->x.name).collect(Collectors.joining(","));
       System.out.println(allNameLaptop1);
       
     //joining
       String allNameLaptop2 = productsList.stream().map(x->x.name).collect(Collectors.joining(",","Prefix-- "," --Sufix"));
       System.out.println(allNameLaptop2);
       
       
      
                                                                                                                                                                                         /*List<String> result = productsList.stream()
        		  .collect(collectingAndThen(toList(), ImmutableList::copyOf));
        */
      
       
        /*List<Integer> newList=Arrays.asList(1,2,3,4,5);
        Double priceSum=productsList.stream().collect(Collectors.summarizingDouble(x->x.price));*/
	}

}
