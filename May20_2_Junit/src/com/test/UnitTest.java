package com.test;
import static org.junit.Assert.assertEquals;

import org.junit.*;

import com.calculate.Calculate;;



public class UnitTest
{
	Calculate calculate=new Calculate();
	int sum=calculate.sum(2,5);
	int testSum=7;
	@Test
	public void testSum()
	{
		System.out.println("Add is ="+sum +"Expected "+testSum);
		assertEquals(sum, testSum);
	}
}
