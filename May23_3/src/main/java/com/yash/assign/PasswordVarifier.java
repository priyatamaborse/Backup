package com.yash.assign;

import java.util.regex.Pattern;

public class PasswordVarifier {

	public Boolean varify(String password) {
		if (password != null && password.length() >= 8 && Pattern.matches(".*[A-Z].*", password ) && Pattern.matches(".*[a-z].*", password) && Pattern.matches(".*[0-9].*", password))
			return true;
		return false;
	}
}
