package com.yash.assign;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringCalculatorTest {
	@Rule
	public ExpectedException exception = ExpectedException.none();

	private StringCalculator stringCalculator = new StringCalculator();
	
	@Test
	public void shouldReturnZeroWhenInputIsEmpty()
	{
		Integer actual = stringCalculator.sumStringWithDifferentInput("","");
		assertEquals(0, actual.intValue());
	}

	@Test
	public void shouldReturnNumberItselfWhenSingleDigitString()
	{ 
		int actualOutput = stringCalculator.sumStringWithDifferentInput("1","");
		assertEquals(1, actualOutput);
	}
	
	@Test
	public void shouldReturnSumOfNumberWhenMoreThanOneDigitString()
	{
		int actualOutput = stringCalculator.sumStringWithDifferentInput("1,2",",");
		assertEquals(3, actualOutput);
	}
	
	@Test
	public void shouldReturnSumOfNumberWhenMoreThanOneDigitStringWithAnyDelimiter()
	{
		int actualOutput = stringCalculator.sumStringWithDifferentInput("1 2 3 4 5"," ");
		assertEquals(15, actualOutput);
	}
	
	@Test
	public void shouldAllowMultipleDelimiter()
	{
		int actualOutput = stringCalculator.sumStringWithDifferentInput("1\n5,1,5","\\n|,");
		assertEquals(12, actualOutput);
	}
	
	@Test
	public void shouldNotAllowMultipleDelimiterContinue()
	{
		int actualOutput = stringCalculator.sumStringWithDifferentInput("1\n2,7;5","[, | \\n | ;]");
		assertEquals(15, actualOutput);
	}
	
	@Test
	public void shouldNotAllowNegativeNumber()
	{
		exception.expect(NegativeNumberException.class);
		stringCalculator.sumStringWithDifferentInput("-1\n-2,-7;5","[, | \\n | ;]");
	}
	
	@Test
	public void shouldNotSumNumberGreaterThan1000()
	{
		int actualOutput =stringCalculator.sumStringWithDifferentInput("1\n2000,7;5","[, | \\n | ;]");
		assertEquals(13, actualOutput);
	}
	
	@Test
	public void shouldTakeSemicolonAsDelimiter()
	{
		int actualOutput =stringCalculator.sumStringWithDifferentInput("//;?;\n1;2;3",";");
		assertEquals(6, actualOutput);
	}
}
