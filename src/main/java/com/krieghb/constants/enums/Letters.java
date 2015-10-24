package com.krieghb.constants.enums;

import java.util.ArrayList;
import java.util.List;

public enum Letters {

	
	
	A0 		("############################"),
	A1 		("############################"),
	A2 		("###                      ###"),
	A3 		("###     ############     ###"),
	A4 		("###     ############     ###"),
	A5 		("###     ############     ###"),
	A6 		("###     ############     ###"),
	A7 		("###                      ###"),
	A8 		("###     ############     ###"),
	A9 		("###     ############     ###"),
	A10		("###     ############     ###"),
	A11		("###     ############     ###"),
	A12		("###     ############     ###"),
	A13		("###     ############     ###"),
	A14		("###     ############     ###"),
	A15		("###     ############     ###"),
	A16		("############################"),
	A17		("############################"),
	
	
	I0 		("############################"),
	I1 		("############################"),
	I2 		("###                      ###"),
	I3		("###########      ###########"),
	I4		("###########      ###########"),
	I5		("###########      ###########"),
	I6		("###########      ###########"),
	I7		("###########      ###########"),
	I8		("###########      ###########"),
	I9		("###########      ###########"),
	I10		("###########      ###########"),
	I11		("###########      ###########"),
	I12		("###########      ###########"),
	I13		("###########      ###########"),
	I14		("###########      ###########"),
	I15		("###                      ###"),
	I16		("############################"),
	I17		("############################"),
	
	
	L0		("############################"),
	L1 		("############################"),
	L2		("###     ####################"),
	L3		("###     ####################"),
	L4		("###     ####################"),
	L5		("###     ####################"),
	L6		("###     ####################"),
	L7		("###     ####################"),
	L8		("###     ####################"),
	L9		("###     ####################"),
	L10		("###     ####################"),
	L11		("###     ####################"),
	L12 	("###     ####################"),
	L13		("###     ####################"),
	L14		("###     ####################"),
	L15		("###                      ###"),
	L16		("############################"),
	L17		("############################"),
	

	S0 		("############################"),
	S1 		("############################"),
	S2		("###                      ###"),
	S3		("###     ####################"),
	S4 		("###     ####################"),
	S5		("###     ####################"),
	S6		("###     ####################"),
	S7 		("###     ####################"),
	S8 		("###                      ###"),
	S9 		("###                      ###"),
	S10		("####################     ###"),
	S11		("####################     ###"),
	S12		("####################     ###"),
	S13		("####################     ###"),
	S14		("####################     ###"),
	S15		("###                      ###"),
	S16		("############################"),
	S17		("############################"),
	
	;
	

	public final static String[] Letter_L = {L0.getLine(), L1.getLine(),  L2.getLine(),  L3.getLine(),  L4.getLine(),  L5.getLine(),  L6.getLine(),  L7.getLine(),  L8.getLine(),
								 			 L9.getLine(), L10.getLine(), L11.getLine(), L12.getLine(), L13.getLine(), L14.getLine(), L15.getLine(), L16.getLine(), L17.getLine()};
	public final static String[] Letter_I = {I0.getLine(), I1.getLine(), I2.getLine(), I3.getLine(), I4.getLine(), I5.getLine(), I6.getLine(), I7.getLine(), I8.getLine(),
		 									 I9.getLine(), I10.getLine(), I11.getLine(), I12.getLine(), I13.getLine(), I14.getLine(), I15.getLine(), I16.getLine(), I17.getLine()};
	public final static String[] Letter_S = {S0.getLine(), S1.getLine(), S2.getLine(), S3.getLine(), S4.getLine(), S5.getLine(), S6.getLine(), S7.getLine(), S8.getLine(),
											 S9.getLine(), S10.getLine(), S11.getLine(), S12.getLine(), S13.getLine(), S14.getLine(), S15.getLine(), S16.getLine(), S17.getLine()};
	public final static String[] Letter_A = {A0.getLine(), A1.getLine(), A2.getLine(), A3.getLine(), A4.getLine(), A5.getLine(), A6.getLine(), A7.getLine(), A8.getLine(),
		 									 A9.getLine(), A10.getLine(), A11.getLine(), A12.getLine(), A13.getLine(), A14.getLine(), A15.getLine(), A16.getLine(), A17.getLine()};
	
	private final String letterLine;
	
	
	private Letters(String letterLine) {
		
		this.letterLine = letterLine;
		
	}
	
	public String getLine() {
		return this.letterLine;
	}

	
	public String getLetterBox(String name) {
		String returnLetter = "";
		List<String[]> letters = new ArrayList<String[]>();
		char letter;
		
		for (int index = 0; index < name.length(); index++) {
			
			
			
			letter = name.charAt(index);
			
			System.out.println(letter);
			
			switch (letter) {
			
			case 'a':	
			case 'A':
						letters.add(Letter_A);
						break;
						
			case 'i':	
			case 'I':
						letters.add(Letter_I);
									break;
									
			case 'l':	
			case 'L':
						letters.add(Letter_L);
									break;									
			case 's':	
			case 'S':
						letters.add(Letter_S);
									break;
			
						
			default: 	
						break;

			}
			
		}
		
		
		for (int i = 0; i < Letter_L.length; i++) {
			for (int i2 = 0; i2 < letters.size(); i2++) {
				
				returnLetter += letters.get(i2)[i];
				
			}
			returnLetter += "\n";
		}
		
		
		
		return returnLetter;
	}
	

}
