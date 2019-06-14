package optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		Optional<Integer> optional=list.stream().filter(x->x==8).findAny();
		System.out.println(optional);
		
		List<String> list1=Arrays.asList("abc","pqr","lmd","stq","acd");
		//check condition given in filter and return only first matching string
		Optional<String> str=list1.stream().filter(x->x.startsWith("a")).findFirst();
		System.out.println(str.get());
		
		//check condition given in filter and return any string matching (not necessary it must be first)
		Optional<String> str1=list1.stream().filter(x->x.endsWith("d")).findAny();
		System.out.println(str1.get());
		
		
		List<String> listString=Arrays.asList("1","2","3","4","5");
		List<Integer> listInt=listString.stream().map(x->Integer.parseInt(x)).collect(Collectors.toList());
		listInt.stream().filter(x->x%2==0).forEach(System.out::println);
		
		//or
		listString.stream().map(x->Integer.parseInt(x)).filter(x->x%2==0).forEach(System.out::println);
	}

}
