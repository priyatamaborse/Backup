package com.yash.assign;

public class NegativeNumberException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	NegativeNumberException(String message)
	{
		super(message);
		System.out.println(message);
		
	}
}
