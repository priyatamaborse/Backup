package com.yash.timeout.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeOutTest {

	//@Rule
	//public Timeout globalTimeout =Timeout.seconds(2);

	@Test(timeout=1000)   //Pass
	public void testInfiniteTametakingLoop1() throws InterruptedException
	{
	    while (true)
	    {
	        Thread.currentThread().sleep(1);
	    }
	}
	 
	@Test   //Fail
	public void testInfiniteTametakingLoop2() throws InterruptedException
	{
	    while (true)
	    {
	        Thread.currentThread().sleep(5000);
	    }
	}
}
