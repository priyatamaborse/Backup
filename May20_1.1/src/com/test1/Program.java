package com.test1;

class A
{
	
}

class B extends A
{
	
}

class C extends B
{
	
}

public class Program {

	
	public static void method(A a)
	{
		System.out.println("one");
	}
	
	public static void method(B b)
	{
		System.out.println("three");
	}
	
	public static void method(Object obj)
	{
		System.out.println("five");
	}
	public static void main(String[] args) {
		
		C c=new C();
		method(c);
	}

}
