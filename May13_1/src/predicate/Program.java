package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
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

	public static Predicate<Employee> getIdGreaterTwo()
	{
		return e->e.getId()>2;
	}
	public static void main(String[] args) 
	{
		Employee employee=new Employee(1, "abc");
		
		Predicate<Employee> predicate= e -> e.name.equals("priya");
		System.out.println(predicate.test(employee));
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(4,"priya"));
		list.add(new Employee(1,"Riya"));
		list.add(new Employee(2,"Jiya"));
		list.add(new Employee(3,"Siya"));
		//return true if any one match with predicate condition
		System.out.println(list.stream().anyMatch(predicate));
		//return false if any one not match predicate condition
		System.out.println(list.stream().allMatch(x->x.getName().equalsIgnoreCase("Riya")));
		
		Predicate<Employee> predicate2=Program.getIdGreaterTwo();
		System.out.println(predicate2.test(employee));
		
		System.out.println(list.stream().noneMatch(x->x.getName().equalsIgnoreCase("Riya")));
	}

}
