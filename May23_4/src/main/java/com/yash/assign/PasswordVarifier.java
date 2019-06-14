package com.yash.assign;

import java.util.regex.Pattern;

public class PasswordVarifier {

	public boolean varify(String password) {

		int count=0;
		boolean flag=false;
		if(password==null)
			throw new PasswordNotOkException("Password is null");
		if(password.length()>=8)
			count++;
		if(Pattern.matches(".*[A-Z].*", password ))
			count++;
		if( Pattern.matches(".*[0-9].*", password))
			count++;
		if(Pattern.matches(".*[a-z].*", password))
		{
			count++;
			flag=true;
		}
		if(count>=3 && flag==true){
			return true;
		}
		else{
			throw new PasswordNotOkException("Password must contain least one lower case letter");
		}
	}

}