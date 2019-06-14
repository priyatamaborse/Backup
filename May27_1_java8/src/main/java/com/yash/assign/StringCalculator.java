package com.yash.assign;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class StringCalculator {

	public Integer sumStringWithDifferentInput(String stringInput, String delimiter) {

		final Logger LOGGER = Logger.getLogger(StringCalculator.class.getName());
		LOGGER.setLevel(Level.INFO);
		LOGGER.log(Level.INFO, "Info Log");

		Integer sumOfNumber = 0;
		String negativeNumber = "";

		if (stringInput.isEmpty())
			return 0;
		else {
					if (stringInput.startsWith("//")) {
						String stringOfNumberAndDelimeter = stringInput.substring(stringInput.indexOf('\n') + 1);
						Iterator<String> eachNumber = Arrays.stream(stringOfNumberAndDelimeter.split(stringInput.substring(2, stringInput.indexOf('\n')))).collect(Collectors.toList()).iterator();
						while (eachNumber.hasNext()) {
							sumOfNumber = sumOfNumber + Integer.parseInt(eachNumber.next());
						}
						return sumOfNumber;
					} else {
						Iterator<String> eachNumber = Arrays.stream(stringInput.split(delimiter)).collect(Collectors.toList()).iterator();
						while (eachNumber.hasNext()) {
							if (Integer.parseInt(eachNumber.next()) > 0) 
								sumOfNumber = sumOfNumber + ((Integer.parseInt(eachNumber.next()) > 1000) ? 0 : Integer.parseInt(eachNumber.next()));
							else
								negativeNumber = negativeNumber + "," + eachNumber.next();
						}
					}
		
				}
				if (!negativeNumber.isEmpty()) {
					throw new NegativeNumberException("negatives not allowed for number like " + negativeNumber);
				}
				return sumOfNumber;
			}

}
