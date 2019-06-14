package stream_map_method;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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


public class Program 
{

	public static void main(String[] args) 
	{
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1, "priya"));
		list.add(new Employee(2, "riya"));
		list.add(new Employee(3, "priyanka"));
		list.add(new Employee(4, "giya"));
		list.add(new Employee(5, "maya"));
		list.add(new Employee(6, "priyatama"));
		list.add(new Employee(7, "nita"));
		//list.stream().map(x->x.getName().startsWith("p")).forEach(System.out::println);
		//list.stream().map(x->x.getName()).filter(x->x.startsWith("p")).forEach(System.out::println);
		//or
		list.stream().map(Employee::getName).filter(x->x.startsWith("p")).forEach(System.out::println);
		list.stream().map(x->x).filter(x->x.getName().startsWith("p")).forEach(System.out::println);
		

	}

}
