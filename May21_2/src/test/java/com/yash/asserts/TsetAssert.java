package com.yash.asserts;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class TsetAssert {


	String obj1="junit";
	String obj2="junit";
	String obj3="test";
	String obj4="test";
	String obj5=null;
	int var1=1;
	int var2=2;
	int[] aritmatic1={1,2,3};
	int[] aritmatic2={1,2,3};
	
	@Test
	public void assertEqual()
	{
		assertEquals("assertEqual",obj1, obj2);
		assertNotEquals(obj1, obj3);
		assertNull(obj5);
		assertSame(obj1, obj2);
		assertArrayEquals(aritmatic1,aritmatic2);
		assertTrue(obj1.equals(obj2));
		
		
	}
	
	@Test
	public void matcherTest()
	{
		assertThat("expect string",is("expect string"));
		assertThat("abc", is("abc"));
		
	}
}
