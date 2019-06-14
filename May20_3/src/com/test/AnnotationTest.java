package com.test;

import org.junit.*;

public class AnnotationTest
{
	@BeforeClass
	public static void  testBeforClassAnnotation()
	{
		System.out.println("in testBeforClassAnnotation");
	}
	@Before
	public void testBeforAnnotation()
	{
		System.out.println("in testBeforAnnotation");
	}
	
	@After
	public void testAfterAnnotation()
	{
		System.out.println("in testAfterAnnotation");
	}
	
	@AfterClass
	public static void testAfterClassAnnotation()
	{
		System.out.println("in testAfterClassAnnotation");
	}
	
	@Test
	public void testTestCase()
	{
		System.out.println("in testTestCase");
	}
	
	@Ignore
	public void ignoreTest()
	{
		System.out.println("in ignoreTest");
	}
}
