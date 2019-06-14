package parallel_array_sort;

import java.util.Arrays;
import java.util.Comparator;





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

public class Program {

	public static void main(String[] args) {
		Integer[] arr={5,1,3,12,2,3,4,};
		
		//parallelSort
		Arrays.parallelSort(arr);
		Arrays.stream(arr).forEach(System.out::println);
		
		//parallelSort(arr,startIndex,endIndex)
		//start index included and end index excluded
		Arrays.parallelSort(arr, 0, 3);
		Arrays.stream(arr).forEach(System.out::println);
		
		Product[] productArr=new Product[5];
		productArr[0]=new Product(1,"HP Laptop",25000f);  
		productArr[1]=new Product(2,"Dell Laptop",30000f);  
		productArr[2]=new Product(3,"Lenevo Laptop",28000f);  
		productArr[3]=new Product(4,"Sony Laptop",28000f);  
		productArr[4]=new Product(5,"Apple Laptop",90000f);
		
		//parallelSort(arr,comparator)
		Arrays.parallelSort(productArr, (p1,p2)->p1.getName().compareTo(p2.getName()));
		Arrays.stream(productArr).forEach(System.out::println);
		
		//parallelSort(arr,startIndex,endIndex,comparator)
		Arrays.parallelSort(productArr,0,2, (p1,p2)->p1.getName().compareTo(p2.getName()));
		Arrays.stream(productArr).forEach(System.out::println);
		
		//parallelSort(arr,comparator)
		Arrays.parallelSort(productArr, (p1,p2)->(int)(p1.price-p2.price));
		Arrays.stream(productArr).forEach(System.out::println);
		//to reverse sort use - sign
	}

}
