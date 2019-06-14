package sorted;

import java.util.ArrayList;
import java.util.List;
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

	public static void main(String[] args) 
	{
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(4,"Priya"));
		list.add(new Employee(1,"Riya"));
		list.add(new Employee(2,"Jiya"));
		list.add(new Employee(3,"Siya"));
		list.stream().sorted((e1,e2)->e1.getId()-e2.getId()).forEach(System.out::println);
		list.stream().sorted((e1,e2)->e2.getId()-e1.getId()).forEach(System.out::println);
		
		//toArray
		Stream<String> str=Stream.of("a","b");
		str.toArray();
	}

}
