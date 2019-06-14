package com.yash.assign;

public class PasswordNotOkException extends RuntimeException{

	public PasswordNotOkException(String message) {
		super(message);
		System.out.println(message);
	}

}
