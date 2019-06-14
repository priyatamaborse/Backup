package com.yash.assign;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz fizzbuzz=new FizzBuzz();
	
	@Test
	public void testDivisibleByThree()
	{
		String actual = fizzbuzz.divisibilityCheck(3);
		assertEquals("fizz", actual);
	}
	
	@Test
	public void testDivisibleByFive()
	{
		String actual = fizzbuzz.divisibilityCheck(5);
		assertEquals("buzz", actual);
	}
	
	@Test
	public void testDivisibleByThreeAndFive()
	{
		String actual = fizzbuzz.divisibilityCheck(15);
		assertEquals("fizzbuzz", actual);
	}
	
	@Test
	public void shouldReturnNullWhenNotDivisibleByFiveThreeAndBoth()
	{
		String actual = fizzbuzz.divisibilityCheck(17);
		assertEquals(null, actual);
	}
}
