package com.yash.assign;

public class NegativeNumberException extends RuntimeException {

	NegativeNumberException(String message)
	{
		super(message);
		System.out.println(message);
		
	}
}
