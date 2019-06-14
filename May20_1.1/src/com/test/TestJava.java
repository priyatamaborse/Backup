package com.test;

import java.util.ArrayList;
import java.util.List;

public class TestJava {

	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<Integer>();
		System.out.println(list.size());
	
		
		
		TestJava j=new TestJava();
		System.out.println(j.test());
	
	}
	public String test()
	{
		String str=null;
		try {
			str="try";
			return str;
		} catch (Exception e) {
			str="catch";
			str ="catch";
		}
		finally {
			str="finally";
			System.out.println("in finally"+str);
		}
		return str;
	}

}
