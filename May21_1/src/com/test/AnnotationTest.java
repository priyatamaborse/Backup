package com.test;

import org.junit.*;
import org.junit.rules.ExpectedException;

public class AnnotationTest
{
	@BeforeClass
	public static void  testBeforClassAnnotation()
	{
		System.out.println("in BeforClass");
	}
	@Before
	public void testBeforAnnotation()
	{
		System.out.println("in Befor");
	}
	
	@After
	public void testAfterAnnotation()
	{
		System.out.println("in After");
	}
	
	@AfterClass
	public static void testAfterClassAnnotation()
	{
		System.out.println("in AfterClass");
	}
	
	@Test
	public void testTestCase()
	{
		System.out.println("in testCase 1");
	}
	
	@Test
	public void testTwo()
	{
		System.out.println("in testTestCase 2");
	}
	
	@Ignore
	public void ignoreTest()
	{
		System.out.println("in ignoreTest");
	}
	
	
	
}
