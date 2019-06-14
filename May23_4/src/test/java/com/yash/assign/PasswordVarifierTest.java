package com.yash.assign;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PasswordVarifierTest {
	
	PasswordVarifier passwordVerifier=new PasswordVarifier();
	
	@Test
	public void passwordSatisfyLowerLetterLengthCondition() throws PasswordNotOkException
	{
		assertEquals(passwordVerifier.varify("yasHTech12"),true);
	}
	
	@Test(expected=PasswordNotOkException.class)
	public void passwordNotSatisfyAnyThreeConditionIncludingForth() 
	{
		passwordVerifier.varify("a");
	}
	
	@Test(expected=PasswordNotOkException.class)
	public void shouldSatisfyForthConditionOtherwiseThrowPasswordNotOkException()
	{
		passwordVerifier.varify("TECH1234");
		
	}
	
	@Test(expected=PasswordNotOkException.class)
	public void passwordNullThenThrowPasswordNotOkException()
	{
		passwordVerifier.varify(null);
		
	}
	
	@Test
	public void shouldSatisfyForthConditionAlongWithOtherTwoCondition()
	{
		assertEquals(passwordVerifier.varify("yashtesh1"),true);
	}
	
	
}
