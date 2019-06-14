package com.yash.assign;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
	
	static int count = 1;

	public Map<String, Integer> stringAlongWithCount(String string, String delimiter) {

		Map<String, Integer> stringsAlongWithCount = new HashMap<String, Integer>();
		String[] splitedStrings = string.split(delimiter);
		for (String eachString : splitedStrings) {
			if (stringsAlongWithCount.containsKey(eachString))
				stringsAlongWithCount.put(eachString, stringsAlongWithCount.get(eachString) + 1);
			else
				stringsAlongWithCount.put(eachString, 1);
		}
		return stringsAlongWithCount;
	}

}
