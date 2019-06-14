package flat_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//if you have collection under another collection then flat map just do like ignore outer
//collection and combine all inner collection elements and return all in single collection 
class Employee
{
	String name;
	Set<String> books;
	public Employee() {
		
	}
	public Employee(String name, Set<String> books) {
		super();
		this.name = name;
		this.books = books;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getBooks() {
		return books;
	}
	public void setBooks(Set<String> books) {
		this.books = books;
	}
	
	public void addBook(Set<String> book)
	{
		this.setBooks(book);

	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", books=" + books + "]";
	}
	
}


public class Program {

	public static void main(String[] args) 
	{
		List<Integer> innerList=Arrays.asList(1,2,3,4,5);
		List<Integer> innerList1=Arrays.asList(1,2,3,4,5);
		List<List<Integer>> outterList=Arrays.asList(innerList,innerList1);
		System.out.println("Before flat map"+outterList);
		//outterList.stream().forEach(System.out::println);
		outterList.stream().flatMap(x->x.stream()).collect(Collectors.toList()).forEach(System.out::println);;
		
		Set<String> book=new HashSet<>();
		book.add("JEE");
		book.add("Core Java");
		book.add("hibernate");

		Set<String> book1=new HashSet<>();
		book1.add("JEE1");
		book1.add("Core Java1");
		book1.add("hibernate1");
		
		List<Employee> list=new ArrayList<>();
		list.add(new Employee("abc",book));
		list.add(new Employee("pqr",book1));
		list.stream().flatMap(x->x.getBooks().stream()).forEach(System.out::println);;

		list.stream().filter(x->x.getName().startsWith("a")).forEach(System.out::println);;
	}

}
