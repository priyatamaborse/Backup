package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

//old way
class CompareOnId implements Comparator<Employee>
{

	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}
	
}
public class Program 
{
	
	
	public static void main(String[] args) 
	{
		//1 way
		List<Employee> list=new ArrayList<>();
		CompareOnId compareOnId=new CompareOnId();
		list.add(new Employee(4,"Priya"));
		list.add(new Employee(1,"Riya"));
		list.add(new Employee(2,"Jiya"));
		list.add(new Employee(3,"Siya"));
		list.sort(compareOnId);
		list.stream().forEach(System.out::println);
		
		
		//2 way by java 8
		Comparator<Employee> comparator=( e1, e2)->
		{
			return e1.getId()-e2.getId();
		};
		Collections.sort(list, comparator);
		list.forEach(System.out::println);
		
		//3
		Collections.sort(list,( e1, e2)->
		{
			return e1.getId()-e2.getId();
		});
		list.forEach(System.out::println);
	
		//reverse for decending
		//first comparing on basis of name then on basis of id (if name same)
		Comparator<Employee> comparator1=Comparator.comparing(Employee::getName).thenComparing(Employee::getId).reversed();
		Collections.sort(list, comparator1);
		list.forEach(System.out::println);
	}

}
