package com.yash.assign;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringCalculatorTest {
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();

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
		Integer actualOutput = stringCalculator.sumStringWithDifferentInput("1","");
		assertEquals(1, actualOutput.intValue());
	}
	
	@Test
	public void shouldReturnSumOfNumberWhenMoreThanOneDigitString()
	{
		Integer actualOutput = stringCalculator.sumStringWithDifferentInput("1,2",",");
		assertEquals(3, actualOutput.intValue());
	}
	
	@Test
	public void shouldReturnSumOfNumberWhenMoreThanOneDigitStringWithAnyDelimiter()
	{
		Integer actualOutput = stringCalculator.sumStringWithDifferentInput("1 2 3 4 5"," ");
		assertEquals(15, actualOutput.intValue());
	}
	
	@Test
	public void shouldAllowMultipleDelimiter()
	{
		Integer actualOutput = stringCalculator.sumStringWithDifferentInput("1\n5,1,5","\\n|,");
		assertEquals(12, actualOutput.intValue());
	}
	
	@Test
	public void shouldNotAllowMultipleDelimiterContinue()
	{
		Integer actualOutput = stringCalculator.sumStringWithDifferentInput("1\n2,7;5","[, | \\n | ;]");
		assertEquals(15, actualOutput.intValue());
	}
	
	@Test
	public void shouldThrowNegativeNumberExceptionWhenInputHasNegativeNumbers()
	{
		expectedException.expect(NegativeNumberException.class);
		stringCalculator.sumStringWithDifferentInput("-1\n-2,-7;5","[, | \\n | ;]");
	}
	
	@Test
	public void shouldNotIncludeNumberInAdditionWhenItIsAboveThousand()
	{
		Integer actualOutput = stringCalculator.sumStringWithDifferentInput("1\n2000,7;5","[, | \\n | ;]");
		assertEquals(13, actualOutput.intValue());
	}
	
	@Test
	public void shouldTakeSemicolonAsDelimiter()
	{
		Integer actualOutput =stringCalculator.sumStringWithDifferentInput("//;?;\n1;2;3",";");
		assertEquals(6, actualOutput.intValue());
	}
}
