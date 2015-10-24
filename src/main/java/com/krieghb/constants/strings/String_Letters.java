package com.krieghb.constants.strings;

public final class String_Letters {
	
	public final static String L0 = "**************";
	public final static String L1 = "****  ********";
	public final static String L2 = "****  ********";
	public final static String L3 = "****  ********";
	public final static String L4 = "****  ********";
	public final static String L5 = "****  ********";
	public final static String L6 = "****  ********";
	public final static String L7 = "****        **";
	public final static String L8 = "**************";

	public final static String I0 = "**************";
	public final static String I1 = "***        ***";
    public final static String I2 = "******  ******";
	public final static String I3 = "******  ******";
    public final static String I4 = "******  ******";
    public final static String I5 = "******  ******";
    public final static String I6 = "******  ******";
    public final static String I7 = "***        ***";
    public final static String I8 = "**************";
	public final static String[] Letter_I = {I0, I1, I2, I3, I4, I5, I6, I7, I8};

	public final static String S0 = "**************";
	public final static String S1 = "**          **";
	public final static String S2 = "**  **********";
	public final static String S3 = "**  **********";
	public final static String S4 = "**          **";
	public final static String S5 = "**********  **";
	public final static String S6 = "**********  **";
	public final static String S7 = "**          **";
	public final static String S8 = "**************";
	public final static String[] Letter_S = {S0, S1, S2, S3, S4, S5, S6, S7, S8};

	public final static String A0 = "**************";
	public final static String A1 = "**          **";
	public final static String A2 = "**  ******  **";
	public final static String A3 = "**  ******  **";
	public final static String A4 = "**          **";
	public final static String A5 = "**  ******  **";
	public final static String A6 = "**  ******  **";
	public final static String A7 = "**  ******  **";
	public final static String A8 = "**************";
	public final static String[] Letter_A = {A0, A1, A2, A3, A4, A5, A6, A7, A8};

	
	
	
	
	public String buildName(String[] name) {
		String newName = "";
		
		int namesize = 9;
		
		for (int index = 0; index < namesize; index++) {
			for (String letter : name) {
				newName += letter;
			}
			newName += "\n";
		}
		
		return newName;
	}
}
