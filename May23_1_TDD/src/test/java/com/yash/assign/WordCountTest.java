package com.yash.assign;
import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class WordCountTest {

	WordCount wordCount=new WordCount();
	
	@Test
	public void testWordCountWithCommanDelimiter()
	{
		Map<String, Integer> expectedMap = new HashMap<String, Integer>();
		expectedMap.put("abc", 2);
		expectedMap.put("pqr", 1);
		expectedMap.put("lmn", 1);
		Map<String, Integer> actualMap = wordCount.stringAlongWithCount("abc,pqr,lmn,abc",",");
		assertEquals(expectedMap, actualMap);
	}
	@Test
	public void testWordCountWithSpaceDelemeter()
	{
		Map<String, Integer> expectedMap = new HashMap<String, Integer>();
		expectedMap.put("abc", 2);
		expectedMap.put("pqr", 1);
		expectedMap.put("lmn", 1);
		Map<String, Integer> actualMap = wordCount.stringAlongWithCount("abc pqr lmn abc"," ");
		assertEquals(expectedMap, actualMap);
	}
}