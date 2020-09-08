package com.ice.auto.utils;

public class DataGenerator {

	static final String NUMERIC="0123456789"; 
	public static String getNumeric(int count) {
		StringBuilder stringBuilder = new StringBuilder();
		while(count-- !=0) {
			int character=(int) (Math.random()*NUMERIC.length());
			stringBuilder.append(NUMERIC.charAt(character));
		}
		return stringBuilder.toString();
	}
	
	
}
