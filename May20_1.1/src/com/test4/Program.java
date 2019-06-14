package com.test4;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.remove(new Integer(3)); //execute well it treate 3 as value in list
			list.remove(3); //IndexOutOfBoundsException it treat 3 as index
		
	}

}
