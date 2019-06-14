package com.yash.assign;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PasswordVarifierTest {
	
	PasswordVarifier passwordVerifier=new PasswordVarifier();
	
	@Test
	public void passwordLengthFalseVerifier()
	{
		assertEquals(passwordVerifier.varify("yash"),false);
	}
	

	
	@Test
	public void passwordNullTrueVerifier()
	{
		assertEquals(passwordVerifier.varify(null),false);
	}
	
	@Test
	public void passwordNullFalseVerifier()
	{
		assertEquals(passwordVerifier.varify(null),false);
	}
	
	@Test
	public void passwordUpperCaseLetterTrueVerifier()
	{
		assertEquals(passwordVerifier.varify("YeshTechnology7"),true);
	}
	
	@Test
	public void passwordUpperCaseLetterFalseVerifier()
	{
		assertEquals(passwordVerifier.varify("yashtechnolog"),false);
	}
	

	@Test
	public void passwordLowerCaseLetterFalseVerifier()
	{
		assertEquals(passwordVerifier.varify("YASHTECHNOLOGY"),false);
	}
	
	@Test
	public void passwordDigitTrueVerifier()
	{
		assertEquals(passwordVerifier.varify("yashtechnologY7"),true);
	}
	
	@Test
	public void passwordDigitFalseVerifier()
	{
		assertEquals(passwordVerifier.varify("yashtechnologY"),false);
	}
}
