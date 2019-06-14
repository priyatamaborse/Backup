package com.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RuleTset {

	@Rule
	public ExpectedException exception=ExpectedException.none();

	@Test
	public void testDivisionException()
	{
		exception.expect(ArithmeticException.class);
		exception.expectMessage("Divide by zero");
		
		int res=1/0;
	}
}
