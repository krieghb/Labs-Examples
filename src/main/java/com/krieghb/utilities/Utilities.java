package com.krieghb.utilities;

public class Utilities {
	

	public static StringBuilder setSBWidth(StringBuilder inString, int size) {
		StringBuilder outString = new StringBuilder(inString);
		
		
		for (int i = inString.length(); i < size; i++) {
			outString.insert(0, " ");
		}
				
		
		return outString;
		
	}

}
