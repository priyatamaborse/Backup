package com.yash.assign;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class StringCalculator {
	
	private final static Logger logger = Logger.getLogger(StringCalculator.class.getName());

	public Integer sumStringWithDifferentInput(String stringInput, String delimiter) {
		
		
		
		logger.setLevel(Level.INFO);
		logger.log(Level.INFO, "Info Log");
		
		Integer sumOfNumber = 0;
		String negativeNumber = "";
		
		if (stringInput.isEmpty())
			return 0;
		else {
			if (stringInput.startsWith("//")) {
				String delimiterForCaseFour = stringInput.substring(2, stringInput.indexOf('\n'));
				String stringOfNumberAndDelimeter = stringInput.substring(stringInput.indexOf('\n') + 1);
				String[] arrayOfNumbers = stringOfNumberAndDelimeter.split(delimiterForCaseFour);
				for (String eachNumber : arrayOfNumbers) {
						sumOfNumber = sumOfNumber + Integer.parseInt(eachNumber);
				}
				return sumOfNumber;
			} else {
				String[] arrayOfNumbers = stringInput.split(delimiter);
				for (String eachNumber : arrayOfNumbers) {
					if (Integer.parseInt(eachNumber) > 0)
						sumOfNumber = sumOfNumber
								+ ((Integer.parseInt(eachNumber) > 1000) ? 0 : Integer.parseInt(eachNumber));
					else
						negativeNumber = negativeNumber + "," + eachNumber;
				}
				if (!negativeNumber.isEmpty()) {
					throw new NegativeNumberException("negatives not allowed for number like " + negativeNumber);
				}
				return sumOfNumber;
			}
		}

	}

}
