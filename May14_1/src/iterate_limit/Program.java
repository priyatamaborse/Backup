package iterate_limit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args)
	{
		//iterator and limit
		Stream.iterate(1, x->x+1).limit(10).forEach(System.out::println);
		
		
		//max and min
		Integer max=Stream.of(1,2,3,4,5,6,7,8,9).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
		String min=Stream.of("1","2","3","4").min(Comparator.comparing(String::valueOf)).get();
		System.out.println(min);
		
		//reduce
		Integer sum=Stream.of(1,2,3,4).reduce((x,y)->x+y).get();
		System.out.println(sum);
		Integer sum1=Stream.of(1,2,3,4).reduce(10,(a,b)->a+b);
		System.out.println(sum1);
		
		//skip
		Stream.of(1,2,3,4).skip(1).forEach(System.out::println);
		
	}

}
