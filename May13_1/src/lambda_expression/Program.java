package lambda_expression;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Testable
{
	public String sayHi();
}

@FunctionalInterface
interface Addable
{
	public int add(int a,int b);
}

public class Program  
{
	

	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("All elements");
		list.stream().forEach(System.out::println);
		System.out.println("even elements in list");
		list.stream().filter(x->x%2==0).forEach(System.out::println);
	

		Testable test=()->
		{
			return "hi";
		};
		System.out.println(test.sayHi());
		
		Addable addable=(a,b)->
		{
			return a+b;
		};
		System.out.println("Addition : "+addable.add(5, 6));
	}

}
