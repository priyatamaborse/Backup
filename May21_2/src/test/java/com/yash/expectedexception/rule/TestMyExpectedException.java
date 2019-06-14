package com.yash.expectedexception.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import May21_2.May21_2.Calculation;

public class TestMyExpectedException {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void testDivideByZeroException() {
		
		Calculation calculation = new Calculation();
	
			System.out.println("in test");
			exception.expect(ArithmeticException.class);
			exception.expectMessage("Divide by");
			calculation.division(20, 0);
		

	}

}
