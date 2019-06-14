package optional;

import java.util.Optional;

public class Program {

	public static void main(String[] args) {
		//Optional Object creation
		//of
		Optional<Integer> optional=Optional.of(10);
		System.out.println(optional.isPresent());
		
		//Optional Object creation
		//empty
		Optional<Integer> optional1=Optional.empty();
		System.out.println(optional1);
		
		//ofNullable
		String[] arr=new String[4];
		arr[0]="sgsgsd";
		arr[1]=null;
		Optional<String> optional2 = Optional.ofNullable(arr[0]);
		System.out.println(optional2);
		Optional<String> optional3 = Optional.ofNullable(arr[1]);
		System.out.println(optional3);
		
		//orElse
		int val=optional.orElse(100);
		
		System.out.println(val);
		
		//get
		System.out.println(optional.get());
		
	}

}
