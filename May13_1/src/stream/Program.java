package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee
{
	int id;
	String name;
	public Employee() 
	{
		System.out.println("ïn parameterless");
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class Program {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(4,"priya"));
		list.add(new Employee(1,"Riya"));
		list.add(new Employee(2,"Jiya"));
		list.add(new Employee(3,"Siya"));
		
		
		Stream.Builder<String> sBuilder=Stream.builder();
		Stream<String> stream=sBuilder.add("abc").add("pqr").add("lmn").build();
		stream.forEach(System.out::println);
		
		List<Employee> listIdGreaterTwo=list.stream().filter(x->x.getId()>2).collect(Collectors.toList());
		listIdGreaterTwo.forEach(System.out::println);
		//or
		list.stream().filter(x->x.getId()>2).collect(Collectors.toList()).forEach(System.out::println);
		
		List<Integer> list1=Arrays.asList(1,2,3,4);
		list1.stream().map(n->n*2).collect(Collectors.toList()).forEach(System.out::println);
		
		Stream<String> stream2=Stream.of("Yash","hi");
		Stream<String> stream3=Stream.of("hi","Technologies");
		Stream<String> stream4=Stream.concat(stream2, stream3);
		stream4.forEach(System.out::print);
		
		//we can perform operation on stream only once otherwise it gives 
		//stream has already been operated upon or closed error
		//Stream.concat(stream2,stream3).distinct().forEach(System.out::print);
		//long count=stream2.count();
		//System.out.println("count :"+count);
	}

}
