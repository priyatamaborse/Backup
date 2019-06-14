package com.yash.assign;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {
	static int count = 1;

	public Map<String, Long> stringAlongWithCount(String string, String delimiter) {

		return Arrays.stream(string.split(delimiter)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
	}

}
